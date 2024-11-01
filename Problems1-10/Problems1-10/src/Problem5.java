import java.util.Scanner;

public class Problem5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = 0;

        while (true) {
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) {
                    System.out.print("Please enter a positive integer for the number of strings: ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid integer: ");
            }
        }

        String shortest = null;
        String longest = null;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter string " + i + ": ");
            String input = scanner.nextLine();

            if (i == 1) {
                shortest = input;
                longest = input;
            } else {
                if (input.length() < shortest.length()) {
                    shortest = input;
                }
                if (input.length() > longest.length()) {
                    longest = input;
                }
            }
        }

        // Display the results
        System.out.println("\nShortest String: " + shortest + " (Length: " + shortest.length() + ")");
        System.out.println("Longest String: " + longest + " (Length: " + longest.length() + ")");

        scanner.close();
    }
}
