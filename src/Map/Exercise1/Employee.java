package Map.Exercise1;

import java.util.Objects;

public class Employee {
    private String firstname;
    private String lastName;
    private double salary;

    public Employee(String firstname, String lastName, double salary) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(firstname, employee.firstname) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastName, salary);
    }

    @Override
    public String toString() {
        return firstname + " " + lastName + " wypłata: " + salary + "zł";
    }
}
