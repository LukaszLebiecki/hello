package Recursion;

public class TestApp {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.add(new Product("telefon", 512.5));
        cart.add(new Product("zegarek", 120.5));
        cart.add(new Product("chleb", 8.5));
        cart.add(new Product("czekolada", 7.3));
        cart.add(new Product("bułki", 2.5));
        cart.add(new Product("komputer", 7999.0));
        cart.add(new Product("samochód", 75000.0));
        cart.add(new Product("drukarka", 350.0));
        cart.add(new Product("drukarka2", 350.0));



        double v = cart.totalCost();
        System.out.printf("Suma: %.2fzł", v);
    }
}
