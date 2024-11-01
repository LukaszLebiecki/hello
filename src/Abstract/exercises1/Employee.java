package Abstract.exercises1;

public abstract class Employee {
    public static final int NO_OF_MONTHS_IN_YEAR = 12;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    abstract double monthSalary();
    abstract double yearSalary();

    @Override
    public String toString() {
        return firstName + " " + lastName + ", wypłata miesięczna: " + monthSalary() + ", wypłata roczna: " + yearSalary();
    }
}
