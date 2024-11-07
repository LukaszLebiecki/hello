package Array.Exercise1;

import java.util.Arrays;

public class PersonDatabase {
    private final int INITIAL_CAPACITY = 1;
    private Person[] people = new Person[INITIAL_CAPACITY];
    private int emptyPlace = 0;
    private int numberOfPerson = 0;

    public void add(Person p) {
        if (people.length <= numberOfPerson) {
            people = Arrays.copyOf(people, people.length + 1);
        }
        people[emptyPlace] = p;
        numberOfPerson++;
        emptyPlace++;
    }

    public void remove(Person p) {
        Person[] copy = new Person[people.length];
        for (int i = 0; i < people.length; i++) {
            if(p.equals(people[i])) {
                System.arraycopy(people, 0, copy, 0, i);
                System.arraycopy(people, i+1, copy, i, people.length - (i+1));
            }
        }
        numberOfPerson--;
        people = copy;
    }


    public Person get(int index) {
        return people[index];
    }

    public int size() {
        return numberOfPerson;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Person person : people) {
            text.append(person);
            text.append("\n");
        }
        return text.toString();
    }
}
