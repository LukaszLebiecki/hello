package Inheritance.Exercise1;

public class ExhaustPart extends Part {
    private boolean emissionStandards;

    public ExhaustPart(boolean emissionStandards) {
        this.emissionStandards = emissionStandards;
    }

    public boolean isEmissionStandards() {
        return emissionStandards;
    }

    public void setEmissionStandards(boolean emissionStandards) {
        this.emissionStandards = emissionStandards;
    }
}
