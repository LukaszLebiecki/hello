package Control;

import java.util.Random;

public class NumberUtils {

    void compareNumberAndPrint(int number, int compareTo) {
        if (number == compareTo) {
            System.out.println("Liczba jest równa " + compareTo);
        } else if (number > compareTo) {
            System.out.println(number + " jest większa od " + compareTo);
        } else {
            System.out.println(number + " jest mniejsza od " + compareTo);
        }
    }

    void printOddOrEvent(int number) {
        if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }

    int getFourDigitNumber(int number) {
        if (number == 0) {
            return 0;
        } else if (number / 1000 != 0) {
            return number;
        } else if (number / 100 != 0) {
            return number * 10;
        } else if (number / 10 != 0) {
            return number * 100;
        } else
            return number * 1000;
    }
}
