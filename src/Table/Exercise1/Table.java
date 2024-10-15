package Table.Exercise1;

public class Table {

    public static void main(String[] args) {
        int[] table1 = {1, 2, 3};
        int[] table2 = {4, 5, 6};

        int result = table1[0] + table1[1] + table1[2] + table2[0] + table2[1] + table2[2];

        System.out.println("Suma dwóch tablic: " + result);

        System.out.println("Suma dwóch tablic z metody: " + suma(table1, table2));
    }

    static int suma(int[] t1, int[] t2) {
        return t1[0] + t1[1] + t1[2] +t2[0] +t2[1] + t2[2];
    }
}
