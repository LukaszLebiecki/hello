package Comperable;

public class Offer implements Comparable<Offer>{
    private String city;
    private double price;
    private double area;

    public Offer(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double priceForMeter() {
        return price / area;
    }

    @Override
    public String toString() {
        return city + ", " + price + "zł, " + area + "mkw, "
                + String.format("%.2f", priceForMeter()) + "zł/mkw";
    }

    @Override
    public int compareTo(Offer o) {
        if(priceForMeter() > o.priceForMeter())
            return 1;
        else if (priceForMeter() < o.priceForMeter())
            return -1;
        return 0;
    }
}
