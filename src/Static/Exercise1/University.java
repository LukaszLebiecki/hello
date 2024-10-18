package Static.Exercise1;

public class University {
    public static void main(String[] args) {
        Student s1 = new Student("Niko", "Lebiecki", 1234);
        Student s2 = new Student("Nati", "Lebiecki", 1234);

        System.out.println("Liczba studentów to: " + Student.NUMBER_STUDENTS);
    }
}
