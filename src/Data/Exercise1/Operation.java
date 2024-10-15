package Data.Exercise1;

public class Operation {

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if(b == 0) {
            System.out.println("Pamiętaj kolego nie dziel przez zero");

        }
        return a / b;
    }
}
