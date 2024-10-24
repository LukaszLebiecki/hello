package Enum.Exercise2;

public enum Status {
    NEW("złożono zamówienie, ale jeszcze go nie opłacono"),
    PAID("opłacone"),
    SHIPPED("wysłane"),
    DELIVERED("dostarczone"),
    CANCELLED("anulowano");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        String result = "";
        for (Status value : values()) {
            result += value.name() + " ";
        }
        return result;
    }
}
