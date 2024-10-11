package Objects;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.firstName = "Łukasz";
        employee1.secondName = "Lebiecki";
        employee1.yearOfBirth = 1985;
        employee1.workExperience = 21;
        System.out.println(employee1);

        employee2.firstName = "Nikodem";
        employee2.secondName = "Lebiecki";
        employee2.yearOfBirth = 2012;
        employee2.workExperience = 4;
        System.out.println(employee2);

        employee3.firstName = "Natalka";
        employee3.secondName = "Lebiecka";
        employee3.yearOfBirth = 2014;
        employee3.workExperience = 1;
        System.out.println(employee3);
    }
}
