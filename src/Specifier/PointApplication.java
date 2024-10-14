package Specifier;

import Specifier.control.PointController;
import Specifier.data.Point;
import java.util.Scanner;


public class PointApplication {
    public static void main(String[] args) {
        
        Point point = new Point(5,5);
        PointController controller = new PointController();

        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());

        controller.addX(point);
        controller.addX(point);
        controller.minusY(point);

        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());

        System.out.println("===============================");

        final int addX = 0;
        final int addY = 1;
        final int minusX = 2;
        final int minusY = 3;
        final int exit = 4;

        Scanner scanner = new Scanner(System.in);
        int control;
        do {
            System.out.print("Wprowadz liczbe: ");
            control = scanner.nextInt();

            switch (control) {
                case addX -> controller.addX(point);
                case addY -> controller.addY(point);
                case minusX -> controller.minusX(point);
                case minusY -> controller.minusY(point);
                case exit -> System.out.println("bay bay");
                default -> System.out.println("błędna wartość");
            }
            System.out.print("x = " + point.getX());
            System.out.println("; y = " + point.getY());
        } while (control != 4);

    }
}
