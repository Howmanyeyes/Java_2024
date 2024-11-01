import java.util.Scanner;

public class Problem8 {
    private double x;
    private double y;
    private double z;

    public Problem8(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double dotProduct(Problem8 other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Problem8 crossProduct(Problem8 other) {
        double crossX = this.y * other.z - this.z * other.y;
        double crossY = this.z * other.x - this.x * other.z;
        double crossZ = this.x * other.y - this.y * other.x;
        return new Problem8(crossX, crossY, crossZ);
    }

    public Problem8 add(Problem8 other) {
        return new Problem8(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Problem8 subtract(Problem8 other) {
        return new Problem8(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 3D Vector Operations ===");

        // Input for the first vector
        System.out.println("Enter coordinates for the first vector:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("z1: ");
        double z1 = scanner.nextDouble();

        Problem8 vector1 = new Problem8(x1, y1, z1);

        // Input for the second vector
        System.out.println("\nEnter coordinates for the second vector:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("z2: ");
        double z2 = scanner.nextDouble();

        Problem8 vector2 = new Problem8(x2, y2, z2);

        // Display vectors
        System.out.println("\nVector 1: " + vector1);
        System.out.println("Vector 2: " + vector2);

        // Calculate and display lengths
        System.out.println("\nLength of Vector 1: " + vector1.length());
        System.out.println("Length of Vector 2: " + vector2.length());

        // Calculate and display dot product
        double dotProduct = vector1.dotProduct(vector2);
        System.out.println("\nDot Product of Vector 1 and Vector 2: " + dotProduct);

        // Calculate and display cross product
        Problem8 crossProduct = vector1.crossProduct(vector2);
        System.out.println("Cross Product of Vector 1 and Vector 2: " + crossProduct);

        // Calculate and display sum
        Problem8 sum = vector1.add(vector2);
        System.out.println("\nSum of Vector 1 and Vector 2: " + sum);

        // Calculate and display difference
        Problem8 difference = vector1.subtract(vector2);
        System.out.println("Difference of Vector 1 and Vector 2: " + difference);

        scanner.close();
    }
}
