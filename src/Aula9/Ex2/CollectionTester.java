package Aula9.Ex2;

import java.util.*;

public class CollectionTester {
    public static void main(String[] args) {
        int[] DIM = { 1000, 5000, 10000, 20000, 40000, 100000 };
        List<Collection<Integer>> col = new ArrayList<>();
        col.add(new ArrayList<>());
        col.add(new LinkedList<>());
        col.add(new HashSet<>());
        col.add(new TreeSet<>());

        System.out.printf("%n%-15s", "Collection");
        for (int i = 0; i < DIM.length; i++)
            System.out.printf("%10d", DIM[i]);
        System.out.println();

        for (Collection<Integer> collec : col)
            printTable(collec, DIM);
        ;
    }

    private static double[] checkPerformance(Collection<Integer> col, int DIM) {

        double start, stop, deltaAdd, deltaSearch, deltaRemove;

        // Add
        start = System.nanoTime(); // clock snapshot before
        for (int i = 0; i < DIM; i++)
            col.add(i);
        stop = System.nanoTime(); // clock snapshot after
        deltaAdd = (stop - start) / 1e6; // convert to milliseconds

        // Search
        start = System.nanoTime(); // clock snapshot before
        for (int i = 0; i < DIM; i++) {
            int n = (int) (Math.random() * DIM);
            if (!col.contains(n))
                System.out.println("Not found???" + n);
        }
        stop = System.nanoTime(); // clock snapshot after
        deltaSearch = (stop - start) / 1e6; // convert nanoseconds to milliseconds

        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        deltaRemove = (stop - start) / 1e6; // convert nanoseconds to milliseconds

        double[] timeFrame = { deltaAdd, deltaRemove, deltaSearch };

        return timeFrame;
    }

    public static void printTable(Collection<Integer> col, int[] DIM) {
        double[][] table = new double[DIM.length][3];
        String[] op = { "add", "search", "remove" };

        for (int i = 0; i < DIM.length; i++) {
            double[] res = checkPerformance(col, DIM[i]);
            table[i] = res;
        }

        String str = "-";
        System.out.printf("%s", col.getClass().getSimpleName());
        System.out.println(str.repeat(75 - col.getClass().getSimpleName().length()));
        for (int j = 0; j < 3; j++) {
            System.out.printf("%-15s", op[j]);
            for (int i = 0; i < DIM.length; i++) {
                System.out.printf("%10.2f", table[i][j]);
            }
            System.out.println();
        }
    }
}
