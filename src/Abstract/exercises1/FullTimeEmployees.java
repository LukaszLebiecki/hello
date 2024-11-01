package Abstract.exercises1;

public class FullTimeEmployees extends Employee {
    private static final double BONUS = 0.05;
    private double monthSalary;

    public FullTimeEmployees(String firstName, String lastName, double monthSalary) {
        super(firstName, lastName);
        this.monthSalary = monthSalary;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }


    @Override
    double monthSalary() {
        return getMonthSalary();
    }

    @Override
    double yearSalary() {
        double yearSalary = getMonthSalary() * NO_OF_MONTHS_IN_YEAR;
        double bonus = yearSalary * BONUS;
        return yearSalary + bonus;
    }
}
