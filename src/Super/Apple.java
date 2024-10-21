package Super;

public class Apple extends Fruit {
    private String variety;

    public Apple(int weight, String variety) {
        super(weight, "jabkowaty");
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        return info + ", odmiana: " + variety;
    }

}
