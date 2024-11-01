public class Problem3 {
    
    public static void printOddNumbers(int[] numbers) {
        StringBuilder odds = new StringBuilder();

        for (int num : numbers) {
            if (num % 2 != 0) {
                if (odds.length() > 0) {
                    odds.append(", ");
                }
                odds.append(num);
            }
        }

        System.out.println(odds.toString());
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printOddNumbers(input); // Expected Output: 1, 3, 5
    }
}
