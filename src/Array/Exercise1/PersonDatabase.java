package Array.Exercise1;

public class PersonDatabase {
    private final int INITIAL_CAPACITY = 1;
    private Person[] people = new Person[INITIAL_CAPACITY];
    private int emptyPlace = 1;

    public void add(Person p) {
        // TODO rozszerzyć tablice
        people[emptyPlace] = p;
        emptyPlace++;
    }

    public void remove(Person p) {
        // TODO
        for (Person person : people) {
            if (p.equals(person)) {

            }
        }
    }

    public Person get(int index) {
        return null;
    }

    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
