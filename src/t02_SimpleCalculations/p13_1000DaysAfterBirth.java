package t02_SimpleCalculations;

import java.time.LocalDate;
import java.util.Scanner;

public class p13_1000DaysAfterBirth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String birthDate = scan.nextLine();

        LocalDate parsedBirthDate = LocalDate.parse(birthDate);
        parsedBirthDate.plusDays(1000);

        System.out.println(parsedBirthDate);
    }
}
