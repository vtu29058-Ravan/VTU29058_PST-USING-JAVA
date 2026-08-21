import java.util.*;

public class StudentCount {
    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(65, 80, 72, 90, 55, 78, 88);

        long count = marks.stream()
                          .filter(mark -> mark > 75)
                          .count();

        System.out.println("Students scored above 75: " + count);
    }
}