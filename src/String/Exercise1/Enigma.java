package String.Exercise1;

import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            String s = sc.nextLine();
            char c = s.charAt(s.length() - 1);
            sb.append(c);
        }

        String text = sb.toString();
        System.out.println(text);
    }
}
