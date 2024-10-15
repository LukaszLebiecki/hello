package Table.Exercise2;

public class Test {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Person person1 = new Person(1, 60);
        Person person2 = new Person(2, 80);
        Person person3 = new Person(3, 300);
        Person person4 = new Person(4, 120);
        Person person5 = new Person(5, 78);


        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);
        elevator.add(person5);
        elevator.add(person4);
        elevator.start();
        elevator.clear();
        elevator.add(person5);
        elevator.add(person4);
        elevator.start();


    }
}
