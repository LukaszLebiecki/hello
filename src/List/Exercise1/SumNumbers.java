package List.Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
    public static final String EXIT = "exit";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillList(numbers);
        printNumbersAndResult(numbers);


    }

    private static void printNumbersAndResult(List<Double> numbers) {
        double result = 0;
        for (Double number : numbers) {
            result += number;
        }
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < numbers.size() - 1; i++) {
            text.append(numbers.get(i));
            text.append(" + ");
        }
        text.append(numbers.get(numbers.size()-1));
        text.append(" = ");
        text.append(result);
        System.out.println(text);
    }

    private static void fillList(List<Double> numbers) {
        System.out.println("Podaj kolejną liczbę (lub wpisz \"exit\"):");

        String stringNumber = sc.nextLine();
        if (stringNumber.equals(EXIT))
            return;
        try {
            Double number = Double.valueOf(stringNumber);
            numbers.add(number);
        } catch (NumberFormatException e) {
            System.err.println("Liczba w niepoprawnym formacie");
        }

        fillList(numbers);
    }


}
