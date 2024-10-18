package Static.Exercise1;

public class Student {
    private String firstName;
    private String lastName;
    private int numberIndex;
    public static int NUMBER_STUDENTS = 0;

    public Student(String firstName, String lastName, int numberIndex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberIndex = numberIndex;
        NUMBER_STUDENTS++;
    }
}
