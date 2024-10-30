package Interface.Exercise1;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculate {
    private Scanner sc = new Scanner(System.in);

    private Circle createCircle() {
        System.out.println("Podaj promień koła: ");
        double r = sc.nextDouble();
        return new Circle(r);
    }

    private Rectangle createRectangle() {
        System.out.println("Podaj bok a: ");
        double a = sc.nextDouble();
        System.out.println("Podaj bok b: ");
        double b = sc.nextDouble();
        return new Rectangle(a, b);
    }

    private Triangle createTriangle() {
        System.out.println("Podaj bok a: ");
        double a = sc.nextDouble();
        System.out.println("Podaj bok b: ");
        double b = sc.nextDouble();
        System.out.println("Podaj bok c: ");
        double c = sc.nextDouble();
        System.out.println("Podaj wysokość h: ");
        double h = sc.nextDouble();
        return new Triangle(a, b, c, h);
    }

    public Shape createShape() {
        int option = sc.nextInt();
        switch (option) {
            case Shape.CIRCLE -> {
                return createCircle();
            }
            case Shape.RECTANGLE -> {
                return createRectangle();
            }
            case Shape.TRIANGLE -> {
                return createTriangle();
            }default -> {
                throw new NoSuchElementException();
            }

        }
    }

    public void clearBuffer() {
        sc.nextLine();
    }
}
