package Methods;

public class House {
    double water;
    double rope;

    public House(double water, double rope) {
        this.water = water;
        this.rope = rope;
    }

    void takeShower() {
        water -= 48;
        System.out.println("Bierzemy prysznic");
    }

    void takeBath() {
        water -= 86;
        System.out.println("Bierzemy kąpiel");
    }

    void makeDinner() {
        water -= 4;
        rope -= 0.1;
        System.out.println("Gotujemu obiad");
    }

    void boilWater() {
        water -= 0.5;
        rope -= 0.05;
        System.out.println("Gotujemy wodę");
    }

    void watchTv(int hour) {
        rope -= (hour * 0.06);
        System.out.println("Oglądamy telewizje przez " + hour + " godziny");
    }

    void info() {
        System.out.println("Ilość wody: " + water + " litrów, ropa: " + rope + " litrów");
    }


}
