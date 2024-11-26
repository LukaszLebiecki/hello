package Iterator.Exercise1;

import java.util.*;

public class NamesIterator {
    public static void main(String[] args) {

        Map<String, Person> people = new TreeMap<>();

        people.put("Kowalski", new Person("Jan", "Kowalski", 35));
        people.put("Adamiak", new Person("Ania", "Adamiak", 21));
        people.put("Zaręba", new Person("Adam", "Zaręba", 17));
        people.put("Piotrowski", new Person("Karol", "Piotrowski", 42));
        people.put("Bobrowska", new Person("Michalina", "Bobrowska", 15));

        Collection<Person> values = people.values();
        Iterator<Person> iterator = values.iterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println(next);
        }


    }
}
