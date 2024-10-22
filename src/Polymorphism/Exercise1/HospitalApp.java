package Polymorphism.Exercise1;

public class HospitalApp {
    public static void main(String[] args) {
        Person doctor = new Doctor("Maciek", "Prefeska", 7500, 1300);
        Person nurse1 = new Nurse("Ania", "Dobroszewska", 2200, 6);
        Person nurse2 = new Nurse("Marta", "Danielska", 2100, 3);

        Hospital hospital = new Hospital();

        hospital.addPerson(doctor);
        hospital.addPerson(nurse1);
        hospital.addPerson(nurse2);

        System.out.println(hospital.getInfo());


    }
}
