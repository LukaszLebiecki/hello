package FileOperations.Exercise1;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {

    private static final String FILE_NAME = "employees.info";
    public static final int READ_FROM_USER = 1;
    public static final int READ_FROM_FILE = 2;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wprowadź danych pracowników - " + READ_FROM_USER);
        System.out.println("Wczytaj i wyświetl daane z pliku - " + READ_FROM_FILE);

        int option = sc.nextInt();
        sc.nextLine();
        if (option == READ_FROM_USER) {
            Company company = createCompany();
            writeFile(company);
        } else if (option == READ_FROM_FILE) {
            Company company = null;
            try {
                company = readFile();
                System.out.println(company);
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Błąd odczytu pliku");
            }

        }
        sc.close();
    }

    private static Company readFile() throws IOException, ClassNotFoundException {
        try (
                var fis = new FileInputStream(FILE_NAME);
                var ois = new ObjectInputStream(fis);
                ) {
            return (Company) ois.readObject();
        }

    }

    private static void writeFile(Company company) {
        try (
                var fos = new FileOutputStream(FILE_NAME);
                var oos = new ObjectOutputStream(fos);
                ) {
            oos.writeObject(company);
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }
    }

    private static Company createCompany() {
        Company company = new Company();
        int countEmployees = 0;
        while (countEmployees < Employee.MAX_EMPLOYEES) {
            System.out.println("Podaj imię:");
            String firstName = sc.nextLine();
            System.out.println("Podaj nazwisko:");
            String lastName = sc.nextLine();
            System.out.println("Podaj wypłatę:");
            double salary = sc.nextDouble();
            sc.nextLine();
            company.add(new Employee(firstName, lastName, salary));
            countEmployees++;
        }
        return company;
    }
}
