package Algorithmics.Exercise2;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int multi = 1;
        int next = 0;

        for (int i = 0; i < 5; i++) {
            next = sc.nextInt();
            multi *= next;
        }

        if (multi >= 0) {
            System.out.println("nieujemna");
        } else {
            System.out.println("ujemna");
        }

    }
}
