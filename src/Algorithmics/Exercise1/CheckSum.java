package Algorithmics.Exercise1;

import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {
        int sum = getSum();
        printOddOrEven(sum);
    }

    private static void printOddOrEven(int sum) {
        if (sum % 2 == 0) {
            System.out.println("parzysta");
        } else {
            System.out.println("nieparzysta");
        }
    }

    private static int getSum() {
        int sum = 0;
        int next = 0;
        Scanner sc = new Scanner(System.in);
        while ((next = sc.nextInt()) <= 100) {
            sum += next;
        }
        return sum;
    }
}
