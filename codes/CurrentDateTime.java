import java.time.LocalDateTime;

public class CurrentDateTime {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Current Date and Time: " + now);
        System.out.println("Date: " + now.toLocalDate());
        System.out.println("Time: " + now.toLocalTime());
    }
}