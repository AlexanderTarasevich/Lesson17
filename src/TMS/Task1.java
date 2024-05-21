package TMS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Введите свой день рождения в формате дд.мм.гггг! ");
        String userDate = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(userDate, formatter);
        LocalDate hundredYearsDate = birthDate.plusYears(100);

        System.out.println(hundredYearsDate.format(formatter)+ " - в этот день Вам исполнится 100 лет!");


    }
}
