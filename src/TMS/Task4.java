package TMS;

import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        // Задаем курс обмена
        double rate = 3.25;

        Consumer<String> convertToUSD = amountInBYN -> {

            double amount = Double.parseDouble(amountInBYN.replace(" BYN", ""));

            double amountInUSD = amount / rate;

            System.out.println(amountInUSD + " USD");
        };


        convertToUSD.accept("2 BYN");
    }
}
