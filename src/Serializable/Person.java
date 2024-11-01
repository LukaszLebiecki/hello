package Serializable;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 3812017177088226528L;

    private String firstName;
    private String lsatName;

    public Person(String firstName, String lsatName) {
        this.firstName = firstName;
        this.lsatName = lsatName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLsatName() {
        return lsatName;
    }

    public void setLsatName(String lsatName) {
        this.lsatName = lsatName;
    }
}

