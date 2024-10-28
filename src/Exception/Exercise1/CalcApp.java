package Exception.Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 0;
        double b = 0;
        String operator = null;

        boolean readComplete = false;
        while (!readComplete) {
            try {
                System.out.println("Podaj pierwsza liczbe:");
                a = sc.nextDouble();
                sc.nextLine();
                System.out.println("Podaj operator:");
                operator = sc.nextLine();
                System.out.println("Podaj druga liczbe");
                b = sc.nextDouble();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.err.println("Wprowadzono niepoprawne dane spróbuj jeszcze raz");
            } finally {
                sc.nextLine();
            }
        }

        try {
            double calc = Calculator.calc(a, b, operator);
            System.out.println("Wynik działamia to: " + calc);
        } catch (UnknownOperatorException | ArithmeticException e) {
            System.err.println(e.getMessage());
        }

    }
}
