package ua.opnu.task4;
import java.util.function.Consumer;
import ua.opnu.task2.Student;
import java.util.Arrays;
public class StudentConsumer {
    public static void main(String[] args) {
        Student[] arr = {
                new Student("Марія", "КН-21", new int[]{90, 88, 92}),
                new Student("Олег", "КН-22", new int[]{70, 73, 85})
        };

        Consumer<Student> printFullName = s ->
                System.out.println(s.getName() + " (" + s.getGroup() + ")");

        Arrays.stream(arr).forEach(printFullName);
    }
}
