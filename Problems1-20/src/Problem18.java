// File: src/Problem18.java

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Problem18 {
    public static void main(String[] args) {
        final int ELEMENTS_TO_ADD = 500_000;
        final int RANDOM_ACCESSES = 100_000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long arrayListAddTime = endTime - startTime;
        System.out.println("ArrayList: Time to add " + ELEMENTS_TO_ADD + " elements: " + formatTime(arrayListAddTime));

        startTime = System.nanoTime();
        populateList(linkedList, ELEMENTS_TO_ADD);
        endTime = System.nanoTime();
        long linkedListAddTime = endTime - startTime;
        System.out.println("LinkedList: Time to add " + ELEMENTS_TO_ADD + " elements: " + formatTime(linkedListAddTime));

        startTime = System.nanoTime();
        randomAccessTest(arrayList, RANDOM_ACCESSES);
        endTime = System.nanoTime();
        long arrayListAccessTime = endTime - startTime;
        System.out.println("ArrayList: Time for " + RANDOM_ACCESSES + " random accesses: " + formatTime(arrayListAccessTime));

        startTime = System.nanoTime();
        randomAccessTest(linkedList, RANDOM_ACCESSES);
        endTime = System.nanoTime();
        long linkedListAccessTime = endTime - startTime;
        System.out.println("LinkedList: Time for " + RANDOM_ACCESSES + " random accesses: " + formatTime(linkedListAccessTime));

        System.out.println("\n=== Performance Summary ===");
        System.out.println(String.format("%-15s %-25s %-25s", "Operation", "ArrayList (ms)", "LinkedList (ms)"));
        System.out.println(String.format("%-15s %-25d %-25d", "Adding Elements", arrayListAddTime / 1_000_000, linkedListAddTime / 1_000_000));
        System.out.println(String.format("%-15s %-25d %-25d", "Random Access", arrayListAccessTime / 1_000_000, linkedListAccessTime / 1_000_000));
    }


    private static void populateList(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
    }

    private static void randomAccessTest(List<Integer> list, int accessCount) {
        Random random = new Random();
        int size = list.size();

        for (int i = 0; i < accessCount; i++) {
            int index = random.nextInt(size);
            Integer value = list.get(index);
        }
    }

    private static String formatTime(long nanoseconds) {
        double milliseconds = nanoseconds / 1_000_000.0;
        return String.format("%.3f ms", milliseconds);
    }
}
