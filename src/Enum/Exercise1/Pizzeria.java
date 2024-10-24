package Enum.Exercise1;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("MENU:");
        Pizza[] pizzas = Pizza.values();
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.ordinal() + " -> " + pizza);
        }

        System.out.println("Podaj numer pizzy: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Pizza pizza = Pizza.fromNumber(choice);
        System.out.println("Zamówiona pizza to: " + pizza);

    }
}
