import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of integers separated by spaces:");

        String inputLine = scanner.nextLine();
        scanner.close();

        String[] numberStrings = inputLine.trim().split("\\s+");

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numberStrings.length; i++) {
            if (i % 2 != 0) {
                try {
                    int number = Integer.parseInt(numberStrings[i]);
                    queue.add(number);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format at position " + i + ": " + numberStrings[i]);
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        
        for (Integer num : queue) {
            list.add(num);
        }

        StringBuilder reversedSequence = new StringBuilder();
        for (Integer num : list) {
            reversedSequence.append(num).append(" ");
        }

        System.out.println("Reversed sequence after removing even-positioned numbers:");
        System.out.println(reversedSequence.toString().trim());
    }
}
