package TMS;

import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ведите строку:");
            String inputString = scanner.nextLine();
            return new StringBuilder(inputString).reverse().toString();
        };
        System.out.println(supplier.get());
    }
}
