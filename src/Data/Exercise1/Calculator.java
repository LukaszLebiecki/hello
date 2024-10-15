package Data.Exercise1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double x;
        double y;
        String operation;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        x = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj znak działania: + , - , / , * ");
        operation = scanner.nextLine();
        System.out.println("Podaj drugą liczbę: ");
        y = scanner.nextDouble();

        Operation op = new Operation();

        result = switch (operation) {
            case ("+") -> op.add(x, y);
            case ("-") -> op.subtract(x, y);
            case ("*") -> op.multiply(x, y);
            case ("/") -> op.divide(x, y);
            default -> 0;
        };


        System.out.println(x + " " + operation + " " + y + " = " + result);

    }
}
