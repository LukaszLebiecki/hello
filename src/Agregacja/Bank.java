package Agregacja;

public class Bank {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();

        Address address1 = new Address();
        Address address2 = new Address();

        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();

        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.residential = address1;
        address1.city = "Warszawa";
        bankAccount1.owner = person1;
        bankAccount1.balance = 10_000;

        person2.firstName = "Marta";
        person2.lastName = "Kowalska";
        person2.residential = address1;
        bankAccount2.owner = person2;
        bankAccount2.balance = 5_000;

        System.out.println("Osoba 1: ");
        System.out.println(bankAccount1.owner.firstName + " " + bankAccount1.owner.lastName);
        System.out.println("mieszka w miejscowości: " + bankAccount1.owner.residential.city);
        System.out.println("posiada konto bankowe z kwotą: " + bankAccount1.balance);

        System.out.println("Osoba 2: ");
        System.out.println(bankAccount2.owner.firstName + " " + bankAccount2.owner.lastName);
        System.out.println("mieszka w miejscowości: " + bankAccount2.owner.residential.city);
        System.out.println("posiada konto bankowe z kwotą: " + bankAccount2.balance);
    }
}
