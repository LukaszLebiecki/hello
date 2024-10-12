package Methods;

public class Offer {
    Product product;
    double price;
    boolean special;

    Offer(Product product, double price, boolean special) {
        this.product = product;
        this.price = price;
        this.special = special;
    }

    void show(){
        System.out.println(product.name + " "
                + product.producer + " "
                + price + "zł, "
                + "oferta specjalna? " + special);
    }
}
