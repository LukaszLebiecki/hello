package Wrappery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kasia ma 23 lata, a jej pies Bruno 10

        System.out.println("Podaj dowolny tekst z literami i cyframi:");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        countOfNumber(text);
        countOfAlphabetic(text);
        biggerNumberToText(text);


    }

    public static void biggerNumberToText(String text) {
        int bigger = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                int numericValue = Character.getNumericValue(c);
                if (numericValue > bigger)
                    bigger = numericValue;
            }

        }
        System.out.println("Największa cyfra w tekście to " + bigger);
    }

    public static void countOfNumber(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c))
                count++;
        }
        System.out.println("Liczba cyfr w tekście: " + count);
    }

    public static void countOfAlphabetic(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isAlphabetic(c))
                count++;
        }
        System.out.println("Liczba liter w tekście: " + count);
    }
}
