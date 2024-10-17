package Data.Exercise2;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    private final int obverse = 1;
    private final int reverse = 0;
    private final int noChoice = -1;
    private int userChoice = noChoice;
    private int flipResult = noChoice;

    private void showOptions() {
        System.out.println("Wbierz orzeł czy reszka ( " + obverse + " - orzeł; " + reverse + " - reszka): ");
    }

    void betResult() {
        showOptions();
        userChoice = scanner.nextInt();
    }

    void flipCoin() {
        flipResult = random.nextInt(2);
    }

    void showResult() {
        if(userChoice == flipResult) {
            System.out.println("Brawo wygrałeś");
        } else {
            System.out.println("Przegrałeś");
        }
    }

}
