package Generic;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> first = new Pair<>(123, "Pierwszy");
        Pair<Double, String> second = new Pair<>(123.3, "Drugi");
        Pair<String, String> third = new Pair<>("text", "Trzeci");

        printPair(first);
        printPair(second);
        printPair(third);

    }

    public static <T, V> void printPair(Pair<T, V> pair) {
        System.out.println("<" + pair.getA() + " ; " + pair.getB() + ">");
    }
}
