import java.util.Scanner;

public class Problem6 {
    public static int countLatinWords(String input) {
        String[] words = input.split("\\s+");

        int count = 0;

        for (String word : words) {
            if (word.matches("[A-Za-z]+")) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string consisting of words separated by spaces:");
        String input = scanner.nextLine();

        int latinWordCount = countLatinWords(input);

        System.out.println("Number of words with only Latin letters: " + latinWordCount);

        scanner.close();
    }
}
