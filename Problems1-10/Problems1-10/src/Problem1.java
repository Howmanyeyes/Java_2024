// File: PowerOfTwoChecker.java

public class Problem1{

    public static boolean isPowerOfTwo(int number) {
        int absNumber = Math.abs(number);
        if (absNumber == 0) {
            return false;
        }
        return (absNumber & (absNumber - 1)) == 0;
    }
    public static void main(String[] args) {
        // Tests
        int[] testNumbers = {3, 4, -8, 0, 1, 16, -1, 1024, 7, -16};

        for (int num : testNumbers) {
            boolean result = isPowerOfTwo(num);
            System.out.println("Is " + num + " a power of two? " + result);
        }
    }
}
