package t02_SimpleCalculations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p13_1000DaysAfterBirth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String birthDate = scan.nextLine();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(birthDate, f);
        date = date.plusDays(999);

        date = LocalDate.parse(date.toString(), f);

        System.out.println(date);
    }
}
