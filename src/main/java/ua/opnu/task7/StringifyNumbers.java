package ua.opnu.task7;
import java.util.function.Function;
import java.util.Arrays;

public class StringifyNumbers {
    public static void main(String[] args) {
        Function<Integer, String> toWord = n -> switch(n) {
            case 0 -> "нуль";
            case 1 -> "один";
            case 2 -> "два";
            case 3 -> "три";
            case 4 -> "чотири";
            case 5 -> "п’ять";
            case 6 -> "шість";
            case 7 -> "сім";
            case 8 -> "вісім";
            case 9 -> "дев’ять";
            default -> "?";
        };

        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        Arrays.stream(arr).mapToObj(toWord::apply).forEach(System.out::println);
    }
}
