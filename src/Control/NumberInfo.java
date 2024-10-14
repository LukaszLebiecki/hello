package Control;

import java.util.Random;

public class NumberInfo {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(10000);

        System.out.println("Wylosowana liczba: " + number);

        NumberUtils numberUtils = new NumberUtils();
        numberUtils.compareNumberAndPrint(number, 5000);
        numberUtils.printOddOrEvent(number);
        int fourDigitNumber = numberUtils.getFourDigitNumber(number);
        System.out.println(fourDigitNumber);
    }
}
