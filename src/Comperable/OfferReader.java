package Comperable;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OfferReader {
    private final int SIZE_TABLE = 10;
    private final String FILE_NAME = "offer.txt";
    private Offer[] offers = new Offer[SIZE_TABLE];

    public Offer[] getOffers() {
        return offers;
    }

    public void readWithFile() {
        File file = new File(FILE_NAME);
        int index = 0;
        try (Scanner sc = new Scanner(file)){
            sc.nextLine();
            while (sc.hasNextLine()) {
                String textLine = sc.nextLine();
                String[] splitText = textLine.split(";");
                String city = splitText[0];
                double price = Double.parseDouble(splitText[1]);
                double area = Double.parseDouble(splitText[2]);
                offers[index] = new Offer(city, price, area);
                index++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Błąd odczytu pliku");
        }
    }
}
