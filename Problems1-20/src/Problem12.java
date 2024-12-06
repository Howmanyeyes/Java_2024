import helpful_classes.Problem12.CallerInfoUtils;

public class Problem12 {
    public static void main(String[] args) {
        System.out.println("=== Caller Information Test ===\n");

        System.out.println("Direct Call from main:");
        String caller1 = CallerInfoUtils.getCallerInfo();
        if (caller1 != null) {
            System.out.println("Caller: " + caller1);
        } else {
            System.out.println("Caller is the entry point (main method).");
        }

        System.out.println("\nIndirect Call via helperMethod():");
        helperMethod();

        System.out.println("\nIndirect Call via anotherHelperMethod():");
        anotherHelperMethod();

        System.out.println("\nEnd of Test.");
    }

    public static void helperMethod() {
        System.out.println("Inside helperMethod()");
        nestedHelperMethod();
    }

    public static void nestedHelperMethod() {
        System.out.println("Inside nestedHelperMethod()");
        String caller = CallerInfoUtils.getCallerInfo();
        if (caller != null) {
            System.out.println("Caller: " + caller);
        } else {
            System.out.println("Caller is the entry point.");
        }
    }

    public static void anotherHelperMethod() {
        System.out.println("Inside anotherHelperMethod()");
        nestedAnotherHelperMethod();
    }

    public static void nestedAnotherHelperMethod() {
        System.out.println("Inside nestedAnotherHelperMethod()");
        String caller = CallerInfoUtils.getCallerInfo();
        if (caller != null) {
            System.out.println("Caller: " + caller);
        } else {
            System.out.println("Caller is the entry point.");
        }
    }
}
