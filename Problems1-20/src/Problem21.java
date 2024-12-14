import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;

public class Problem21 {
    public static <T, R> T[] removeExtraElements(T[] array, Function<T, R> mapper) {
        Set<R> seen = new LinkedHashSet<>();
        Set<T> resultSet = new LinkedHashSet<>();

        for (T element : array) {
            R key = mapper.apply(element);
            if (!seen.contains(key)) {
                seen.add(key);
                resultSet.add(element);
            }
        }

        @SuppressWarnings("unchecked")
        T[] result = (T[]) Arrays.copyOf(array, resultSet.size());
        int index = 0;
        for (T element : resultSet) {
            result[index++] = element;
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 2, 4, 3, 5};
        Integer[] uniqueIntArray = removeExtraElements(intArray, x -> x);
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        System.out.println("Unique Integer Array: " + Arrays.toString(uniqueIntArray));

        String[] stringArray = {"apple", "banana", "cherry", "date", "fig", "grape"};
        String[] uniqueStringArray = removeExtraElements(stringArray, String::length);
        System.out.println("\nOriginal String Array: " + Arrays.toString(stringArray));
        System.out.println("Unique String Array (by length): " + Arrays.toString(uniqueStringArray));

        Person[] personArray = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 30),
            new Person("David", 25),
            new Person("Eve", 35)
        };
        Person[] uniquePersonArray = removeExtraElements(personArray, Person::getAge);
        System.out.println("\nOriginal Person Array: " + Arrays.toString(personArray));
        System.out.println("Unique Person Array (by age): " + Arrays.toString(uniquePersonArray));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
