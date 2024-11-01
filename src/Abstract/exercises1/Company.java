package Abstract.exercises1;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = createEmployees();

        printEmployees(employees);

        double totalMonthSalary = totalMonthSalary(employees);
        double totalYearSalary = totalYearSalary(employees);

        System.out.println("Suma miesięcznych wynagrodzeń: " + totalMonthSalary);
        System.out.println("Suma rocznych wynagrodzeń: " + totalYearSalary);
    }

    private static double totalYearSalary(Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.yearSalary();
        }
        return total;
    }

    private static double totalMonthSalary(Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.monthSalary();
        }
        return total;
    }

    private static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static Employee[] createEmployees() {
        return new Employee[]{new FullTimeEmployees("Jan", "Kowalski", 5000.0),
        new PartTimeEmployees("Anna", "Borowska", 23, 100)};
    }
}
