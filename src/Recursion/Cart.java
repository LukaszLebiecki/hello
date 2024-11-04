package Recursion;

public class Cart {
    public static final int MAX_PRODUCT = 10;

    private Product[] products = new Product[MAX_PRODUCT];
    private int index = 0;
    private int count = 0;
    private double totalSum = 0;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void add(Product product) {
        products[index] = product;
        index++;
    }

    public double totalCost() {
        if (index != 0 && MAX_PRODUCT > count) {
            if (products[count] == null)
                return totalSum;
            totalSum += products[count].getPrice();
            count++;
            totalCost();
        }
        return totalSum;
    }
}
