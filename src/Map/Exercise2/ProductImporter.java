package Map.Exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductImporter {

    static Map<String, TreeSet<Product>> readFile(String fileName) throws FileNotFoundException {
        Map<String, TreeSet<Product>> productsMap = new HashMap<>();
        try (Scanner sc = new Scanner(new File(fileName))) {
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] split = line.split(";");
                String category = split[0];
                Product product = new Product(split[1], Double.parseDouble(split[2]));
                if (productsMap.containsKey(category)) {
                    TreeSet<Product> products = productsMap.get(category);
                    products.add(product);
                } else {
                    TreeSet<Product> categorySet = new TreeSet<>();
                    categorySet.add(product);
                    productsMap.put(category, categorySet);
                }

            }
        }
        return productsMap;
    }
}
