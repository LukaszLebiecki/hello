package Enum.Exercise2;

public class Order {
    private Product product;
    private Status status;

    public Order(Product product, Status status) {
        this.product = product;
        this.status = status;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static Order[] statusOrder(Order[] orders, Status status) {
        int count = 0;
        for (Order order : orders) {
            if (order.status.equals(status)) {
                count++;
            }
        }
        Order[] statusOrders = new Order[count];
        count = 0;
        for (Order order : orders) {
            if (order.status.equals(status)) {
                statusOrders[count] = order;
                count++;
            }

        }
        return statusOrders;
    }

    @Override
    public String toString() {
        return product + " - " + status.getDescription();
    }
}
