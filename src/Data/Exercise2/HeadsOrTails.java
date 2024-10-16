package Data.Exercise2;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {

        final int obverse = 1;
        final int reverse = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wbierz orzeł czy reszka ( " + obverse + " - orzeł; " + reverse + " - reszka): ");
        int userChoice = scanner.nextInt();
        Random random = new Random();
        int flipResult = random.nextInt(2);


        if(userChoice == flipResult) {
            System.out.println("Brawo wygrałeś");
        } else {
            System.out.println("Przegrałeś");
        }
    }
}
