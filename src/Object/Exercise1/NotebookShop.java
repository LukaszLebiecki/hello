package Object.Exercise1;

public class NotebookShop {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Dell", 5555);
        Computer computer2 = new Computer("Lenovo", 24);
        Computer computer3 = new Computer("Dell", 6800);
        Computer computer4 = new Computer("Dell", 5555);
        Computer computer5 = new Computer("HP", 5555);

        DataStore dataStore = new DataStore();
        dataStore.add(computer1);
        dataStore.add(computer2);
        dataStore.add(computer3);
        dataStore.add(computer4);
        dataStore.add(computer5);

        System.out.print("Liczba komputerów " + computer1 + ": ");
        System.out.println(dataStore.checkAvailability(computer1));

        System.out.println("Dostępne komputery: ");
        for (int i = 0; i < dataStore.getCountComputers(); i++) {
            System.out.println(dataStore.getComputers()[i]);
        }


    }
}
