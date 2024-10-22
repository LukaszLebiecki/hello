package Polymorphism.Exercise1;

public class Hospital {

    private int MAX_EMPLOYES = 3;
    private Person[] people = new Person[MAX_EMPLOYES];
    private int currentPeople = 0;

    public void addPerson(Person person) {
        if (currentPeople > MAX_EMPLOYES) {
            System.out.println("Brak miejsc w tablicy");
        } else {
            people[currentPeople] = person;
            currentPeople++;
        }
    }

    public String getInfo() {
        String info = "Pracownicy szpitala:\n";
        for (Person person : people) {
            info += "Imię: " + person.getFirstName() + ", Nazwisko: " + person.getLastName() + ", Wypłata: " + person.getSalary();
            if (person instanceof Doctor) {
                info += ", Premia: " + ((Doctor) person).getBonus();
            }
            if (person instanceof Nurse) {
                info += ", Nadgodziny: " + ((Nurse) person).getOvertime();
            }
            info += "\n";
        }
        return info;
    }
}
