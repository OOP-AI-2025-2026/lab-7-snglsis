package ua.opnu.task3;
import java.util.*;
import java.util.function.Predicate;

public class DualFilter {
    public static void main(String[] args) {
        Integer[] nums = {2, 4, 5, 9, 12, 15, 20};
        Predicate<Integer> even = n -> n % 2 == 0;
        Predicate<Integer> divBy3 = n -> n % 3 == 0;

        System.out.println("Числа, що парні та кратні 3:");
        Arrays.stream(nums)
                .filter(even.and(divBy3))
                .forEach(System.out::println);
    }
}
