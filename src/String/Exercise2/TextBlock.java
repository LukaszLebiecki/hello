package String.Exercise2;

import java.util.Scanner;

public class TextBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wciśnij Enter, aby rzucić kostką");
        sc.nextLine();

        String roll = Dice.roll();
        System.out.println(roll);
    }
}

