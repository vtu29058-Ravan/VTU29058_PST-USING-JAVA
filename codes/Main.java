import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ravan", "gopi", "nagireddy");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}