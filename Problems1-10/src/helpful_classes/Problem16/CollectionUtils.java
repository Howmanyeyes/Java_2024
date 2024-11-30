package helpful_classes.Problem16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class CollectionUtils {
    
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        LinkedHashSet<T> uniqueSet = new LinkedHashSet<>(collection);
        return new ArrayList<>(uniqueSet);
    }
}
