package Loop.Exercise1;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile chcesz wprowdzić liczb: ");
        int count = sc.nextInt();
        sc.nextLine();

        int sum = 0;

        while (count > 0) {
            System.out.println("Podaj liczbe: ");
            sum += sc.nextInt();
            count--;
        }

        System.out.println("Suma tych liczb to: " +sum);
    }
}
