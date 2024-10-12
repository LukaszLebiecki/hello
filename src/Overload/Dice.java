package Overload;

import java.util.Random;

public class Dice {
    int result;

    Dice() {
        this.result = (int) (Math.random() * 6 + 1);
    }

    Dice(int result) {
        this.result = result;
    }

    void roll() {
        result = (int) (Math.random() * 6 + 1);
    }

    void info() {
        System.out.println("Liczba oczek na kostce: " + result);
    }
}
