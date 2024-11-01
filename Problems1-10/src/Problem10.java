import helpful_classes.Problem10.Tram;
import helpful_classes.Problem10.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main class to test Transport hierarchy.
 */
public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Transport Hierarchy Testing ===\n");

        // Creating an instance of Tram
        System.out.println("\nCreating a Tram instance...");
        Tram tram = new Tram("T12", 200, true);
        System.out.println("Tram Details: " + tram);

        // Demonstrating Transport Interface and Polymorphism
        System.out.println("\n--- Transport Interface and Polymorphism ---");
        List<Transport> transports = new ArrayList<>();
        transports.add(tram);

        // Adding more transports if needed (e.g., other classes implementing Transport)
        // For demonstration, we'll stick with Tram

        for (Transport transport : transports) {
            System.out.println("\nProcessing Transport: " + transport.getClass().getSimpleName());
            transport.start();
            System.out.println("Max Speed: " + transport.getMaxSpeed() + " km/h");
            transport.stop();
        }

        scanner.close();
    }
}
