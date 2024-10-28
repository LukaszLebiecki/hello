package Exception.Exercise1;

public class Calculator {
    private static final String ADD = "+";
    private static final String SUBTRACT = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    public static double calc(double a, double b, String operation) {
        double result;
        switch (operation) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> {
                if (b != 0)
                    result = a / b;
                else
                    throw new ArithmeticException("Nie mozesz dzielic przez 0");
            }
            default -> throw new UnknownOperatorException("Bledny operator");
        }
        return result;
    }
}
