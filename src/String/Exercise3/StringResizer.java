package String.Exercise3;

import java.util.Scanner;

public class StringResizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź dowolny tekst:");
        String text = sc.nextLine();
        char firstChar = text.charAt(0);
        if (Character.isUpperCase(firstChar)) {
            System.out.println(text.toUpperCase());
        } else if (Character.isLowerCase(firstChar)) {
            System.out.println(text.toLowerCase());
        } else {
            System.out.println(text);
        }

    }
}
