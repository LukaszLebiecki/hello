package Collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoremIpsum {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader text = new BufferedReader(new FileReader("text2"));

        List<String> words = text.lines()
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .toList();

        // liczba słów zaczynających sie na s
        long count = words.stream()
                .filter(s -> s.startsWith("s"))
                .count();
        System.out.println("Liczba słów zaczynających się na s: " + count);

        // ile słów sklada sie z 5 znków
        long count1 = words.stream()
                .filter(s -> s.length() == 5)
                .count();
        System.out.println("Słów z 5 znków jest: " + count1);

    }
}
