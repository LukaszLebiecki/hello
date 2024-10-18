package Loop.Exercise2;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int showPatients = 2;
        int option = -1;
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        do {
            System.out.println("Wybierz opcję: ");
            System.out.println(exit + " - wyjście z programu");
            System.out.println(addPatient + " - dodaj pacjent");
            System.out.println(showPatients + " - wyswietl liste pacjentów");

            option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.println("Podaj imię: ");
                String firstName = sc.nextLine();
                System.out.println("Podaj nazwizsko: ");
                String lastName = sc.nextLine();
                System.out.println("Podaj pesel: ");
                String pesel = sc.nextLine();
                hospital.addPatient(new Patient(firstName, lastName, pesel));
            }
            if (option == 2) {
                hospital.printPatients();
            }
        } while (option != 0);
        System.out.println("KONIEC");
    }


}
