package Loop.Exercise2;

public class Hospital {
    private final int maxPatientsNumbers = 10;
    private Patient[] patients = new Patient[maxPatientsNumbers];
    private int regPatients = 0;

    public void addPatient(Patient patient) {
        if (regPatients < maxPatientsNumbers) {
            patients[regPatients] = patient;
            regPatients++;
        } else {
            System.out.println("Limit zostal wyczerpany");
        }
    }

    public void printPatients() {
        for (int i = 0; i < regPatients; i++) {
            System.out.println(patients[i].getFirstName() + " "
                    + patients[i].getLastName() + " "
                    + patients[i].getPESEL());
        }
    }


}
