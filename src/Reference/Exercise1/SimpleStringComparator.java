package Reference.Exercise1;

import java.util.Arrays;
import java.util.List;

public class SimpleStringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nikodem", "Magdalena", "Natalia", "Gosia", "Tomek");

        names.sort(String::compareToIgnoreCase);

        names.forEach(System.out::println);
    }
}
