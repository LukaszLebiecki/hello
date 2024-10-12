package Overload;

public class Test {
    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.info();
        dice.roll();
        dice.info();
        Dice dice1 = new Dice(5);
        dice1.info();
    }
}
