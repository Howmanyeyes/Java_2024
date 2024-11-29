import java.util.ArrayList;
import java.util.Scanner;

// Add Element	        boolean add(String s)	        Appends the specified element to the end.
// Insert Element	    void add(int index, String s)	Inserts the element at the specified position.
// Get Element	        String get(int index)	        Retrieves the element at the given index.
// Set Element	        String set(int index, String s)	Replaces the element at the specified index.
// Remove Element	    String remove(int index)	    Removes the element at the specified index.
// Size of List	        int size()	                    Returns the number of elements in the list.
// Check if Empty	    boolean isEmpty()	            Checks if the list is empty.
//  Clear All Elements	void clear()	                Removes all elements from the list.
// Contains Element  	boolean contains(Object o)	    Checks if the list contains the specified element.


public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();

        System.out.println("=== Shortest String Finder ===");
        System.out.println("Please enter 5 strings:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter string " + i + ": ");
            String input = scanner.nextLine();
            stringList.add(input);
        }

        scanner.close();

        int minLength = findMinimumLength(stringList);

        ArrayList<String> shortestStrings = getShortestStrings(stringList, minLength);

        System.out.println("\nShortest string(s):");
        for (String str : shortestStrings) {
            System.out.println(str);
        }
    }

    private static int findMinimumLength(ArrayList<String> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int min = list.get(0).length();
        for (String str : list) {
            if (str.length() < min) {
                min = str.length();
            }
        }
        return min;
    }

    private static ArrayList<String> getShortestStrings(ArrayList<String> list, int minLength) {
        ArrayList<String> shortest = new ArrayList<>();
        for (String str : list) {
            if (str.length() == minLength) {
                shortest.add(str);
            }
        }
        return shortest;
    }
}
