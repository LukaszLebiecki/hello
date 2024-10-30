package Interface.Exercise1;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Calculate {
    public static void main(String[] args) {
        ShapeCalculate sCalc = new ShapeCalculate();

        boolean correct = false;

        while (!correct) {
            try {
                System.out.println("Wybierz figurę (1- koło, 2- prostokąt, 3- trójkąt):");
                Shape shape = sCalc.createShape();
                System.out.println(shape);
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Błędne dane, spróbój ponownie");
            } catch (NoSuchElementException e) {
                System.out.println("Brak opcji (wybierz 1, 2, lub 3");
            } finally {
                sCalc.clearBuffer();
            }
        }
    }
}
