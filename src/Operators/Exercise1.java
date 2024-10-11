package Operators;

public class Exercise1 {
    public static void main(String[] args) {

        int x = (int) (Math.random() * 11);
        int y = (int) (Math.random() * 11);

        boolean result1 = x > y;
        boolean result2 = (x * 2) > y;
        boolean result3 = y < (x + 3) && y > (x - 2);
        boolean result4 = (x * y) % 2 == 0;

        System.out.println("x= " + x);
        System.out.println("y= " + y);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
