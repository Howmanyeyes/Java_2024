import helpful_classes.Problem11.BankAccount;
import helpful_classes.Problem11.InsufficientFundsException;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bank Account Withdrawal Simulator ===\n");

        System.out.print("Enter initial balance for the account: ");
        double initialBalance = getValidDouble(scanner, 0, Double.MAX_VALUE);
        BankAccount account = new BankAccount(initialBalance);
        System.out.println("Account created with balance: " + account.getBalance() + "\n");

        boolean continueTransaction = true;
        while (continueTransaction) {
            System.out.println("Choose an option:");
            System.out.println("1. Withdraw Funds");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = getValidInt(scanner, 1, 4);
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = getValidDouble(scanner, 0, Double.MAX_VALUE);
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (InsufficientFundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = getValidDouble(scanner, 0, Double.MAX_VALUE);
                    try {
                        account.deposit(depositAmount);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance() + "\n");
                    break;
                case 4:
                    continueTransaction = false;
                    System.out.println("Exiting the simulator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }

        scanner.close();
    }

    private static double getValidDouble(Scanner scanner, double min, double max) {
        double value;
        while (true) {
            try {
                value = Double.parseDouble(scanner.nextLine());
                if (value < min || value > max) {
                    System.out.print("Please enter a valid number between " + min + " and " + max + ": ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a numerical value: ");
            }
        }
        return value;
    }

    private static int getValidInt(Scanner scanner, int min, int max) {
        int value;
        while (true) {
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value < min || value > max) {
                    System.out.print("Please enter a valid integer between " + min + " and " + max + ": ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter an integer value: ");
            }
        }
        return value;
    }
}
