import java.util.Scanner;

public class Problem7 {
    public static boolean isValidIPv4(String ip) {
        if (ip == null || ip.isEmpty()) {
            return false; 
        }

        String[] segments = ip.split("\\.");
        
        if (segments.length != 4) {
            return false; 
        }

        for (String segment : segments) {
            if (segment.isEmpty()) {
                return false;
            }

            for (char ch : segment.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    return false; 
                }
            }

            try {
                int value = Integer.parseInt(segment);
                if (value < 0 || value > 255) {
                    return false; 
                }
            } catch (NumberFormatException e) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an IPv4 address to validate (e.g., 192.168.1.1):");
        String inputIP = scanner.nextLine();

        boolean isValid = isValidIPv4(inputIP);

        if (isValid) {
            System.out.println("The IP address " + inputIP + " is valid.");
        } else {
            System.out.println("The IP address " + inputIP + " is invalid.");
        }

        scanner.close();
    }
}
