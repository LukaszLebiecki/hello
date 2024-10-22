package Polymorphism.Exercise2;

public class DefenseCharacter extends GameCharacter {
    private double extraDefense;

    public DefenseCharacter(String name, int energy, int attack, int defense, double extraDefense) {
        super(name, energy, attack, defense);
        this.extraDefense = extraDefense;
    }

    public double getExtraDefense() {
        return extraDefense;
    }

    public void setExtraDefense(double extraDefense) {
        this.extraDefense = extraDefense;
    }

    @Override
    double totalDefense() {
        return super.totalDefense() + extraDefense * getDefense();
    }
}
