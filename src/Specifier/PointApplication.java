package Specifier;

import Specifier.control.PointController;
import Specifier.data.Point;

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

    }
}
