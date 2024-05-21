package TMS;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Integer[] numbers = {-1, -3, 8, 7, -9, 9, -7};
        Predicate<Integer> isPositive = i -> i > 0;

        Arrays.stream(numbers).filter(isPositive).forEach(System.out::println);

    }
}
