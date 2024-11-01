public class Problem4 {
    
    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "Do geese see God?";
        String input2 = "Hello, World!";
        String input3 = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(input1)); // true
        System.out.println(isPalindrome(input2)); // false
        System.out.println(isPalindrome(input3)); // true
    }
}
