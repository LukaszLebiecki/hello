package Enum.Exercise1;

public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    private final boolean tomatoSauce;
    private final boolean cheese;
    private final boolean mushrooms;
    private final boolean ham;

    Pizza(boolean tomatoSauce, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    public static Pizza fromNumber(int number) {
        for (Pizza value : values()) {
            if (value.ordinal() == number)
                return value;
        }
        return null;
    }

    @Override
    public String toString() {
        String result = name() + " (";
        if (tomatoSauce)
            result += "sos pomidorowy";
        if (cheese)
            result += ", ser";
        if (mushrooms)
            result += ", pieczarki";
        if (ham)
            result += ", szynka";
        result += ")";
        return result;
    }
}
