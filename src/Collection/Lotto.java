package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private static final int NO_OF_NUMBERS = 49;
    public static final int MAX_NUMBERS = 6;

    ArrayList<Integer> numbers = new ArrayList<>();
    private List<Integer> lottoResult;

    public Lotto() {
       generate();
       randomize();
    }

    public List<Integer> getLottoResult() {
        return lottoResult;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }


    public void generate() {
        for (int i = 1; i <= NO_OF_NUMBERS; i++) {
            numbers.add(i);
        }
    }

    public void randomize() {
        Collections.shuffle(numbers);
        lottoResult = numbers.subList(0, MAX_NUMBERS);
    }

    public int checkResult(List<Integer> userNumber) {
        int found = 0;
        for (int i = 0; i < MAX_NUMBERS; i++) {
            if (lottoResult.contains(userNumber.get(i))) {
                found++;
            }
        }
        return found;
    }
}
