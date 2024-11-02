package FileOperations.Exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientDataReader {

    public static Client[] readFile(String fileName) {
        int numberOfLines = numberOfLines(fileName);
        Client[] clients = new Client[numberOfLines];
        try (
                Scanner sc = new Scanner(new File(fileName));
        ) {
            sc.nextLine();
            for (int i = 0; i < clients.length; i++) {
                clients[i] = createClientFromCSV(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Błąd odczytu pliku");
        }

        return clients;
    }


    private static Client createClientFromCSV(String csvLine) {
        String[] split = csvLine.split(",");
        int id = Integer.parseInt(split[0]);
        String firstName = split[1];
        String lastName = split[2];
        String country = split[3];
        double value = Double.parseDouble(split[4]);
        return new Client(id, firstName, lastName, country, value);
    }


    private static int numberOfLines(String fileName) {
        int lines = 0;
        try (
                Scanner sc = new Scanner(new File(fileName));
        ) {
            sc.nextLine();
            while (sc.hasNextLine()) {
                sc.nextLine();
                lines++;
            }
        } catch (
                FileNotFoundException e) {
            System.err.println("Błąd odczytu pliku");
        }
        return lines;
    }


}
