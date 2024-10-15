package Table.Exercise3;

public class Tables {
    public static void main(String[] args) {
        double[][] tables = {{1.0, 1.5, 2.0},{1.5, 2.0, 2.5}, {2.0, 2.5, 3.0}};

        double sum1 = (tables[0][0] * tables[1][1] * tables[2][2]) + (tables[0][2] * tables[1][1] * tables[2][0]);
        System.out.println(sum1);

        double sum2 = (tables[0][1] + tables[1][1] + tables[2][1]) * (tables[1][0] + tables[1][1] + tables[1][2]);
        System.out.println(sum2);

        double sum3 = tables[0][0] + tables[0][1] + tables[0][2] + tables[1][0] + tables[1][2] + tables[2][0]
                + tables[2][1] + tables[2][2];
        System.out.println(sum3);
    }
}
