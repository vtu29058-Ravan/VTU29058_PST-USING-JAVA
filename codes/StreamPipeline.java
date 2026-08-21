import java.util.*;

public class StreamPipeline {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            10, 25, 30, 25, 40, 15, 30, 50
        );

        numbers.stream()
               .distinct()
               .filter(n -> n > 20)
               .map(n -> n * 2)
               .sorted()
               .forEach(System.out::println);
    }
}