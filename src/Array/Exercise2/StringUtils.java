package Array.Exercise2;

import java.util.Arrays;

public class StringUtils {
    public static void main(String[] args) {
        String text1 = "abcDEF";
        String text2 = "aDbEgF";

        boolean b = compareLetters(text1, text2);

        System.out.println(b);


    }

    static boolean compareLetters(String text1, String text2) {
        String lowerCase1 = text1.toLowerCase();
        String lowerCase2 = text2.toLowerCase();

        char[] charArray1 = lowerCase1.toCharArray();
        char[] charArray2 = lowerCase2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);

    }
}
