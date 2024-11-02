package FileOperations.Exercise1;

public class Employee extends Person {
    public static final int MAX_EMPLOYEES = 3;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", wypłata: " + salary;
    }
}
