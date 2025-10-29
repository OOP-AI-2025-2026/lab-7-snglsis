package ua.opnu.task2;
import java.util.*;
import java.util.function.Predicate;
public class FilterStudents {
    public static void main(String[] args) {
        Student[] arr = {
                new Student("Іван", "КН-11", new int[]{80, 70, 90}),
                new Student("Петро", "КН-12", new int[]{40, 50, 60}),
                new Student("Олег", "КН-13", new int[]{100, 95, 100})
        };

        Predicate<Student> noDebt = s -> Arrays.stream(s.getMarks()).allMatch(m -> m >= 60);

        System.out.println("Студенти без боргів:");
        Arrays.stream(arr).filter(noDebt).forEach(System.out::println);
    }
}
