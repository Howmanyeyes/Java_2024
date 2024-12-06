package helpful_classes.Problem12;

public class CallerInfoUtils {
    public static String getCallerInfo() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        // Thread.getStackTrace().CallerInfoUtils.getCallerInfo().НАЗВАНИЕ МЕТОДА.НАЗВАНИЕ СЛЕДУЩЕГО
        if (stackTrace.length < 4) {
            return null;
        }

        StackTraceElement caller = stackTrace[3];
        String className = caller.getClassName();
        String methodName = caller.getMethodName();

        return className + "." + methodName;
    }
}
