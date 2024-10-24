package Enum.Exercise2;

import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Order[] orders = new Order[5];
        orders[0] = new Order(new Product("Komputer", 4999), Status.PAID);
        orders[1] = new Order(new Product("Telefon", 347), Status.PAID);
        orders[2] = new Order(new Product("Kubek", 29), Status.SHIPPED);
        orders[3] = new Order(new Product("Rower", 14_599), Status.DELIVERED);
        orders[4] = new Order(new Product("Samochód", 94_999), Status.CANCELLED);

        for (Order order : orders) {
            System.out.println(order);
        }

        System.out.println("Podaj status zamówienia do wyświetlenia (" + Status.NEW.toString() + ")");
        Scanner sc = new Scanner(System.in);
        String status = sc.nextLine();

        Order[] statusOrder = Order.statusOrder(orders, Status.valueOf(status));
        for (Order order : statusOrder) {
            System.out.println(order);
        }

    }


}
