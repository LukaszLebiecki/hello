package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
    public static void main(String[] args) {
        System.out.println("Witamy w losowaniu lotto");
        List<Integer> userNumbers = readNumberFromUser();
        Lotto lotto = new Lotto();
        int i = lotto.checkResult(userNumbers);
        System.out.println("Liczby wylosowane: " + lotto.getLottoResult());
        System.out.println("Liczby wybrane przez uzytkownika: " + userNumbers);
        System.out.println("Liczba trafien: " + i);
    }

    private static List<Integer> readNumberFromUser() {
        List<Integer> userNumber = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Lotto.MAX_NUMBERS; i++) {
            System.out.println("Podaj kolejną liczbę");
            userNumber.add(sc.nextInt());
        }
        return userNumber;
    }
}
