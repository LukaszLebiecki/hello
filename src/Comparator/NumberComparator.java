package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class NumberComparator {
    public static void main(String[] args) {

        Integer[] tab = {3, 6, 2, 4, 62, 7, 10, 34, 23};
        showTable(tab);

        Arrays.sort(tab);
        showTable(tab);

        Arrays.sort(tab, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        showTable(tab);

    }

    static void showTable(Integer[] t) {
        for (int i : t) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
