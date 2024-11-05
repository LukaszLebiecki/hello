package BigInteger;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerApp {
    public static void main(String[] args) {
        final String fileName = "numbers.txt";
        File file = new File(fileName);
        int count = 0;
        int result1 = 0;
        BigInteger a = null;
        BigInteger b = null;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                if (count < 3)
                    result1 += Integer.parseInt(scanner.nextLine());
                else if (count == 4){
                    String line = scanner.nextLine();
                    a = new BigInteger(line);
                } else {
                    String line = scanner.nextLine();
                    b = new BigInteger(line);
                }
                count++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Błąd odczytu pliku");
        }

        System.out.println(result1);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a + b = " + a.add(b));



    }
}
