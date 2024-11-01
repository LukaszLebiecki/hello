package Inner;

public class Main {
    public static void main(String[] args) {
        int[] tab = {4, 2, 9, 23, 8, 12, 99, 72};

        Sortable sortable = new Sortable() {
            @Override
            public void sort(int[] tab) {
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 1; j < tab.length; j++) {
                        if (tab[j - 1] > tab[j]) {
                            int temp = tab[j];
                            tab[j] = tab[j-1];
                            tab[j - 1] = temp;
                        }
                    }
                }
            }
        };
        printTab(tab);
        sortable.sort(tab);
        printTab(tab);
    }

    private static void printTab(int[] tab) {
        for (int i : tab) {
            System.out.print(i + " ");
        }
        System.out.println();;
    }
}
