package Set.Exercise2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductManager {
    private static final int ADD_PRODUCT = 0;
    private static final int EXIT = 1;
    private static final int DISCARD_PRODUCT = 0;
    private static final int REPLACE_PRODUCT = 1;

    private Set<Product> products = new HashSet<>();
    private Scanner sc = new Scanner(System.in);

    void mainLoop() {
        int option;
        do {
            printOption();
            option = readOption();
            evaluationOption(option);
        } while (option != EXIT);
    }

    private void evaluationOption(int option) {
        if (option == ADD_PRODUCT)
            addNextProduct();
        else if (option == EXIT)
            printProduct();
        else
            System.out.println("Nieznana opcja");
    }

    private void addNextProduct() {
        Product product = creataProduct();
        if (products.contains(product)) {
            askAndReplaceProduct(product);
        } else {
            addProduct(product);
        }
    }

    private void askAndReplaceProduct(Product product) {
        System.out.println("Znaleziono product o takiej nazwie, wybierz co chcesz zrobić");
        System.out.println("> Zignoruj produkt - " + DISCARD_PRODUCT);
        System.out.println("> Nadpisz produkt - " + REPLACE_PRODUCT);
        int option = readOption();
        if (option == DISCARD_PRODUCT) {
            System.out.println("W bazie zostawiono poprzedni produkt");
        } else if (option == REPLACE_PRODUCT) {
            products.remove(product);
            products.add(product);
        } else {
            System.out.println("Błędna opcja");
        }
    }

    private void addProduct(Product product) {
        products.add(product);
        System.out.println("Produkt dodany do bazy");
    }

    private Product creataProduct() {
        System.out.println("Podaj nazwę produktu: ");
        String name = sc.nextLine();
        System.out.println("Podaj cenę produktu: ");
        double price = sc.nextDouble();
        return new Product(name, price);
    }

    private void printProduct() {
        System.out.println("Wszystkie produkty:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private int readOption() {
        System.out.println("Wybierz opcję:");
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    private void printOption() {
        System.out.println("Dostępne opcje:");
        System.out.println("> Dodaj nowy produkt - " + ADD_PRODUCT);
        System.out.println("> Koniec programu - " + EXIT);
    }

}
