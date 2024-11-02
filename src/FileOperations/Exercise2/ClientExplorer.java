package FileOperations.Exercise2;

import java.util.Scanner;

public class ClientExplorer {
    public static void main(String[] args) {
        final String FILE_NAME = "clients.csv";

        Client[] clients = ClientDataReader.readFile(FILE_NAME);
        printMostValueClient(clients);
        String country = readCountryFromUser();
        printClientsFromCountry(clients, country);
        printAvgValueForCountry(clients, country);



    }

    private static void printAvgValueForCountry(Client[] clients, String country) {
        double totalValue = 0;
        int clientFromCountryCounter = 0;
        for (Client client : clients) {
            if (country.equals(client.getCountry())) {
                totalValue += client.getValue();
                clientFromCountryCounter++;
            }
        }
        if (totalValue > 0) {
            double avgValue = totalValue / clientFromCountryCounter;
            System.out.printf("Średnia wartość klienta z %s to %.2f", country, avgValue);
        }
    }

    private static void printClientsFromCountry(Client[] clients, String country) {
        System.out.println("Klienci z kraju " + country + ":");
        boolean atLestOneClient = false;
        for (Client client : clients) {
            if (country.equals(client.getCountry())) {
                System.out.println(client);
                atLestOneClient = true;
            }
        }
        if (!atLestOneClient) {
            System.out.println("Brak klientów z " + country);
        }
    }

    private static String readCountryFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwę kraju:");
        return sc.nextLine();
    }

    private static void printMostValueClient(Client[] clients) {
        Client mostValuableClient = clients[0];
        for (Client client : clients) {
            if (client.getValue() > mostValuableClient.getValue()) {
                mostValuableClient = client;
            }
        }
        System.out.println("Najbardziej wartościowy klient to: " + mostValuableClient);
    }
}
