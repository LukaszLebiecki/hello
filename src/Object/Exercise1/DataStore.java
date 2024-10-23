package Object.Exercise1;

public class DataStore {
    private final int MAX_COMPUTERS = 100;
    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int countComputers = 0;

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getCountComputers() {
        return countComputers;
    }

    public void setCountComputers(int countComputers) {
        this.countComputers = countComputers;
    }

    public void add(Computer computer) {
        if (countComputers < MAX_COMPUTERS) {
            computers[countComputers] = computer;
            countComputers++;
        }
    }

    public int checkAvailability(Computer computer) {
        int identicalComp = 0;
        for (int i = 0; i < countComputers; i++) {
            if (computers[i].equals(computer)) {
                identicalComp++;
            }
        }

        return identicalComp;
    }
}
