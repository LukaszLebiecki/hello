package Abstract.exercises1;

public class PartTimeEmployees extends Employee {
    private int numberOfHours;
    private double hourlyRate;

    public PartTimeEmployees(String firstName, String lastName, int numberOfHours, double hourlyRate) {
        super(firstName, lastName);
        this.numberOfHours = numberOfHours;
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    double monthSalary() {
        return numberOfHours * hourlyRate;
    }

    @Override
    double yearSalary() {
        return monthSalary() * NO_OF_MONTHS_IN_YEAR;
    }
}
