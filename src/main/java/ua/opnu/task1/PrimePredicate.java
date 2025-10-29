package ua.opnu.task1;
import java.util.function.Predicate;

public class PrimePredicate {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++)
                if (n % i == 0) return false;
            return true;
        };
        System.out.println("7 просте? " + isPrime.test(7));
        System.out.println("9 просте? " + isPrime.test(9));
    }
}