package FileOperations.Exercise1;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Company implements Serializable {

    private final Employee[] employees = new Employee[Employee.MAX_EMPLOYEES];
    private int index = 0;


    public void add(Employee employee) {
        employees[index] = employee;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : employees) {
            stringBuilder.append(employee);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
