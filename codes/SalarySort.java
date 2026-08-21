import java.util.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class SalarySort {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Ravi", 50000),
            new Employee("Kiran", 30000),
            new Employee("Arun", 70000),
            new Employee("Suresh", 40000)
        );

        Comparator<Employee> salaryComparator = new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.salary - e2.salary;
            }
        };

        employees.stream()
                 .sorted(salaryComparator)
                 .forEach(System.out::println);
    }
}