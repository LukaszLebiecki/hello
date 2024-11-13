package Map.Exercise2;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductManager {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Map<String, TreeSet<Product>> productsMap = ProductImporter.readFile("map2.txt");
            String category = readCategory();
            printCategoryStats(category, productsMap);
        } catch (FileNotFoundException e) {
            System.err.println("Błąd odczytu pliku");
        }




    }

    private static void printCategoryStats(String category, Map<String, TreeSet<Product>> products) {
        if (products.containsKey(category)) {
            TreeSet<Product> productsSet = products.get(category);
            for (Product product : productsSet) {
                System.out.println(product);
            }
            avgPrice(productsSet);
            maxMinPrice(productsSet);

        } else {
            System.out.println("Brak produktów z podanej kategori.");
        }
    }

    private static void maxMinPrice(TreeSet<Product> productsSet) {
        System.out.println("Najtańszy produkt: " + productsSet.first());
        System.out.println("Najdroższy produkt: " + productsSet.last());
    }


    private static void avgPrice(TreeSet<Product> productsSet) {
        double sum = 0;
        for (Product product : productsSet) {
            sum += product.getPrice();
        }
        double avg = sum / productsSet.size();
        System.out.printf("Średnia cena produktów: %.2f\n", avg);
    }


    private static String readCategory() {
        System.out.println("Podaj nazwe kategori do wyswietlenia statystyk:");
        return sc.nextLine();
    }
}
