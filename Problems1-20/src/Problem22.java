import java.util.HashMap;
import java.util.Map;

public class Problem22 {
    public static <T> Map<T, Integer> countOccurrences(T[] array) {
        Map<T, Integer> occurrenceMap = new HashMap<>();
        for (T element : array) {
            if (occurrenceMap.containsKey(element)) {
                occurrenceMap.put(element, occurrenceMap.get(element) + 1);
            } else {
                occurrenceMap.put(element, 1);
            }
        }
        return occurrenceMap;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 2, 4, 3, 5};
        Map<Integer, Integer> intOccurrences = countOccurrences(intArray);
        System.out.println("Integer Array Occurrences: " + intOccurrences);

        String[] stringArray = {"apple", "banana", "apple", "cherry", "banana", "date"};
        Map<String, Integer> stringOccurrences = countOccurrences(stringArray);
        System.out.println("String Array Occurrences: " + stringOccurrences);

    }
}

