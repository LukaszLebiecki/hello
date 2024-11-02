package FileOperations.Exercise2;

import java.util.Objects;

public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String country;
    private double value;

    public Client(int id, String firstName, String lastName, String country, double value) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + country + ", " + value + "zł";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Double.compare(value, client.value) == 0 && Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName) && Objects.equals(country, client.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, country, value);
    }
}
