package Methods;

public class Calculate {
    public static void main(String[] args) {

        double x = 3;
        double y = 7;

        Calculator calculator = new Calculator();

        System.out.println(x + " + " + y + " = " + calculator.add(x,y));
        System.out.println(x + " - " + y + " = " + calculator.subtract(x,y));
        System.out.println(x + " * " + y + " = " + calculator.multiply(x,y));
        System.out.println(x + " / " + y + " = " + calculator.divide(x,y));
    }
}
