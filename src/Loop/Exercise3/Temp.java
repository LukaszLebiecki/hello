package Loop.Exercise3;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj temperaturę aktualną: ");
        double actualTemp = sc.nextInt();
        System.out.println("Podaj temperaturę docelową: ");
        double expectedTemp = sc.nextInt();

        while (actualTemp != expectedTemp) {
            System.out.println("Aktualna temperatura: " + actualTemp);
            if (actualTemp > expectedTemp) {
                actualTemp -= 0.5;
            } else {
                actualTemp += 0.5;
            }
        }
        System.out.println("Osiągnięto temperaturę docelową " + expectedTemp + " stopni");
    }
}
