package Array.Exercise1;

public class Test {
    public static void main(String[] args) {

        PersonDatabase personDatabase = new PersonDatabase();

        personDatabase.add(new Person("Nikodem", "Lebiecki", "123456789"));
        personDatabase.add(new Person("Nikodem2", "Lebiecki2", "123456789"));
        personDatabase.add(new Person("Nikodem3", "Lebiecki3", "123456789"));
        personDatabase.add(new Person("Nikodem4", "Lebiecki4", "123456789"));
        personDatabase.add(new Person("Nikodem5", "Lebiecki5", "123456789"));
        personDatabase.add(new Person("Nikodem6", "Lebiecki6", "123456789"));

        System.out.println(personDatabase);
        System.out.println(personDatabase.size());
        System.out.println(personDatabase.get(3));

        System.out.println("=============");

        personDatabase.remove(new Person("Nikodem3", "Lebiecki3", "123456789"));
        System.out.println(personDatabase);
        System.out.println(personDatabase.size());
        System.out.println(personDatabase.get(3));

    }
}
