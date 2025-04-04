package advanceConcepts;
import java.util.*;


public class StreamExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList( 1,2,90, 100);

        // Example 3: Find the sum of all numbers using reduce
        int sum = numbers.stream()
                .reduce(1, Integer::sum);
        System.out.println("Sum: " + sum);

        // Example 4: Find the maximum number
        int maxNumber = numbers.stream()
                .min(Integer::compare)
                .orElse(-1);
        System.out.println("Max: " + maxNumber);

        // Example 5: Count numbers greater than 50
        long count = numbers.stream()
                .filter((n) -> n > 50)
                .count();
        System.out.println("Count of numbers > 50: " + count);

//        Comparator<Integer> n = new
    }
}
