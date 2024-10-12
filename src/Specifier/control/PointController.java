package Specifier.control;

import Specifier.data.Point;

public class PointController {

    public void addX(Point point) {
        int result = point.getX() + 1;
        point.setX(result);
    }

    public void minusX(Point point) {
        int result = point.getX() - 1;
        point.setX(result);
    }

    public void addY(Point point) {
        int result = point.getY() + 1;
        point.setY(result);
    }

    public void minusY(Point point) {
        int result = point.getY() - 1;
        point.setY(result);
    }

}
