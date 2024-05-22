package TMS;

import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        double exchangeRate = 3.25;
        Function<String, Double> convertToUSD = amountInBYN -> {
            double amount = Double.parseDouble(amountInBYN.replace(" BYN", ""));
            return amount / exchangeRate;
        };

        double usd = convertToUSD.apply("100 BYN");
        System.out.println(usd + " USD");
    }

}
