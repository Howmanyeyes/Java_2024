import helpful_classes.Problem16.CollectionUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Problem16 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
            "Alice", "Bob", "Charlie", "Alice", "Diana", "Bob", "Ethan"
        );

        System.out.println("=== Original Collection ===");
        printCollection(names);

        Collection<String> uniqueNames = CollectionUtils.removeDuplicates(names);

        System.out.println("\n=== Collection After Removing Duplicates ===");
        printCollection(uniqueNames);
    }

    private static void printCollection(Collection<?> collection) {
        for (Object item : collection) {
            System.out.println(item);
        }
    }
}
