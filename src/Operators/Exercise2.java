package Operators;

public class Exercise2 {
    public static void main(String[] args) {

        double priceNetto = 100;
        double vat = 0.23;

        double valueVat = priceNetto * vat;
        double priceBrutto = priceNetto + valueVat;

        System.out.println("Wartość netto: " + priceNetto);
        System.out.println("Wartość vat (23%): " + valueVat);
        System.out.println("Wartość brutto: " + priceBrutto);
    }
}
