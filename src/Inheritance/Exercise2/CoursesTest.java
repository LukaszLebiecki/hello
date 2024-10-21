package Inheritance.Exercise2;

public class CoursesTest {
    public static void main(String[] args) {
        BootcampOnline bootcampOnline = new BootcampOnline("JAVA-ONLINE-123", 239.00, "Kurs JAVA",
                "Najlepszy kurs programowania w JAVA", "Nikodem L.", 30, 1200,
                3);

        System.out.println("Informacje o kursie: " + bootcampOnline.getTitle());
        System.out.println("Opis: " + bootcampOnline.getDescription());
        System.out.println("Cena: " + bootcampOnline.getPrice() + " zl");
        System.out.println("Identyfikator: " + bootcampOnline.getId());
        System.out.println("Nauczyciel: " + bootcampOnline.getTeacher());
    }
}
