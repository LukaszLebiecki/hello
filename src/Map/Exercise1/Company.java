package Map.Exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Company {
    private static final int ADD_EMPLOYER = 1;
    private static final int SEARCH_EMPLOYER = 2;
    private static final int PRINT_MAP = 3;
    private static final int EXIT = 0;

    private Map<String, Employee> employees = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    void mainLoop() {
        int option;
        do {
            printOption();
            option = readOption();
            evaluateOption(option);
        } while (option != EXIT);
    }

    private void evaluateOption(int option) {
        if (option == ADD_EMPLOYER) {
            addEmployer();
        } else if (option == SEARCH_EMPLOYER) {
            searchEmployer();
        } else if (option == EXIT) {
            System.out.println("Bay Bay");
        } else if (option == PRINT_MAP) {
            printMap();
        } else {
            System.out.println("Nieznana opcja");
        }
    }

    private void searchEmployer() {
        System.out.println("Podaj imie i nazwisko pracownika:");
        String name = sc.nextLine();
        Employee employee = employees.get(name);
        if (employee == null) {
            System.out.println("Brak pracownika w bazie");
        } else {
            System.out.println(employee);
        }
    }

    private void printMap() {
        Set<Map.Entry<String, Employee>> entries = employees.entrySet();
        for (Map.Entry<String, Employee> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private void addEmployer() {
        Employee employee = createEmployer();
        employees.put(employee.getFirstname() + employee.getLastName(), employee);
        System.out.println("Dodano practician");
    }

    private Employee createEmployer() {
        System.out.println("Podaj imię:");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = sc.nextLine();
        System.out.println("Podaj wypłatę:");
        double salary = sc.nextDouble();
        return new Employee(firstName, lastName, salary);
    }

    private int readOption() {
        System.out.println("Wybierz opcję:");
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    private void printOption() {
        System.out.println("Dostępne opcje:");
        System.out.println(" > Dodaj procownika - " + ADD_EMPLOYER);
        System.out.println(" > Wyszukaj pracownika - " + SEARCH_EMPLOYER);
        System.out.println(" > Print MAP - " + PRINT_MAP);
        System.out.println(" > Wyjście - " + EXIT);
    }
}
