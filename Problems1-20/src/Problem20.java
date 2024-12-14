import java.util.function.UnaryOperator;

public class Problem20 {
    public static UnaryOperator<Integer> getSquareOperator() {
        return (Integer x) -> x * x;
    }

    public static void main(String[] args) {
        UnaryOperator<Integer> squareOperator = getSquareOperator();

        int number = 33;
        int squared = squareOperator.apply(number);
        System.out.println("Square of " + number + " is " + squared);
    }
}
