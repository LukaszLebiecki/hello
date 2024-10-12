package Overload;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int subtract(int a, int b) {
        return  a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }
}
