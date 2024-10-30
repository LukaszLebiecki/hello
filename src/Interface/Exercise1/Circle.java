package Interface.Exercise1;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Shape.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return Shape.PI * r * 2;
    }

    @Override
    public String toString() {
        return "Koło o promieniu " + r
                + "\nPole koła: " + calculateArea()
                + "\nObwód koła: " + calculatePerimeter();
    }
}
