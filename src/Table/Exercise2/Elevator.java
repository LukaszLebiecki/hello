package Table.Exercise2;

public class Elevator {

    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;

    void add(Person person) {
        if(peopleNumber < 4 ) {
            people[peopleNumber] = person;
            peopleNumber++;
        } else {
            System.out.println("Brak miejsca!");
        }
    }

    void start() {
        if(getTotalWeight() > getMaxWeight()) {
            System.out.println("Winda jest przeciążona o " + (getTotalWeight() - getMaxWeight()) + "kg");
        } else {
            System.out.println("winda wystartowała");
        }
    }

    int getTotalWeight() {
        int sum = 0;
        for (int i = 0; i < peopleNumber; i++) {
            sum += people[i].getWeight();
        }
        return sum;
    }

    void clear() {
        people[0] = null;
        people[1] = null;
        people[2] = null;
        people[3] = null;
        peopleNumber = 0;
        System.out.println("Winda jest pusta");
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
