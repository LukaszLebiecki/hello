package Lambda.Exercise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Numbers {
    static Random random = new Random();
    public static void main(String[] args) {
        List<Integer> randomTenNumbers = createRandomTenNumbers(() -> random.nextInt(100));
        showNumbers(randomTenNumbers, p -> System.out.print(p + " "));
        deleteOddNumbers(randomTenNumbers, p -> p % 2 == 0);
        showNumbers(randomTenNumbers, p -> System.out.print(p + " "));
    }

    private static <T> void deleteOddNumbers(List<T> list, Predicate<T> predicate) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (predicate.test(iterator.next())) {
                iterator.remove();
            }
        }
    }

    private static <T> void showNumbers(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
        System.out.println();
    }

    private static List<Integer> createRandomTenNumbers(Supplier<Integer> supplier) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumber.add(supplier.get());
        }
        return listNumber;
    }
}
