package Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person p2 = null;

        try(
                var fis = new FileInputStream(fileName);
                var ois = new ObjectInputStream(fis);
                ){
            p2 = (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Nie udało się odczytać pliku");
        }

        if (p2 != null) {
            System.out.println(p2.getFirstName() + " " + p2.getLsatName());
        }
    }
}
