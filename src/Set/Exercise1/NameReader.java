package Set.Exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class NameReader {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String n1, String n2) {
                return -n1.compareTo(n2);
            }
        });

        File file = new File("namespl.txt");

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                names.add(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku");
        }

        System.out.println(names);
        System.out.println("Liczba unikalnych imion: " + names.size());
        System.out.println("Pierwsze imię zbioru: " + names.first());
        System.out.println("Ostatnie imię zbioru: " + names.last());


    }
}
