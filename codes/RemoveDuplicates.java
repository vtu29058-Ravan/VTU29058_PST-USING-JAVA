import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 5};

        Set<Integer> set = new LinkedHashSet<>();

        for (int n : numbers) {
            set.add(n);
        }

        System.out.println("After removing duplicates: " + set);
    }
}