package ua.opnu.task5;
import java.util.function.*;
public class PredicateConsumer {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};

        Predicate<Integer> even = n -> n % 2 == 0;
        Consumer<Integer> print = n -> System.out.println(n + " парне");

        for (int n : nums)
            if (even.test(n)) print.accept(n);
    }
}
