import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static void main(String[] args) {

        LocalDate dob = LocalDate.of(2004, 10, 15);

        LocalDate today = LocalDate.now();

        Period age = Period.between(dob, today);

        System.out.println("Age : "
                + age.getYears() + " Years "
                + age.getMonths() + " Months "
                + age.getDays() + " Days");
    }
}