package Objects;

public class Employee {
    String firstName;
    String secondName;
    int yearOfBirth;
    int workExperience;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", workExperience=" + workExperience +
                '}';
    }
}
