package ua.opnu.task6;
import java.util.function.Function;
public class PowerFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> pow2 = n -> (int) Math.pow(2, n);
        for (int i = 0; i <= 8; i++)
            System.out.println("2^" + i + " = " + pow2.apply(i));
    }
}
