package List.Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfNumbers {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        writeNumbers(numbers);
        printCorrectNumbers(numbers);
        printSumNumbers(numbers);
        printAvgNumbers(numbers);

    }

    private static void printAvgNumbers(List<Integer> numbers) {
        double avg = (double) getSum(numbers) / numbers.size();
        System.out.println("Natomiast średnia to: " + avg);
    }

    private static void printSumNumbers(List<Integer> numbers) {
        int sum = getSum(numbers);
        System.out.println("Ich suma wynosi: " + sum);
    }

    private static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static void printCorrectNumbers(List<Integer> numbers) {
        System.out.println("Ile poprawnych liczb: " + numbers.size());
    }

    private static void writeNumbers(List<Integer> numbers) {
        boolean numberIsGood = true;
        while (numberIsGood) {
            System.out.println("Podaj kolejną liczbę nieujemną, podzielną przez 5");
            int i = sc.nextInt();
            if (i < 0 || i % 5 != 0) {
                numberIsGood = false;
            } else {
                numbers.add(i);
            }
        }
    }




}
