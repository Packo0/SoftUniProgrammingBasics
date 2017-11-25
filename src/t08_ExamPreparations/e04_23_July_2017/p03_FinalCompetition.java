package t08_ExamPreparations.e04_23_July_2017;

import java.util.Scanner;

public class p03_FinalCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dancerNumbers = Integer.parseInt(scan.nextLine());
        double score = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String place = scan.nextLine();

        double prize = 0;
        if (place.equals("Bulgaria")) {
            prize = score * dancerNumbers;
        } else if (place.equals("Abroad")) {
            prize = score * dancerNumbers;
            prize += 0.5 * prize;
        }

        double moneyAfterCost = 0;
        if (season.equals("winter") && place.equals("Bulgaria")) {
            moneyAfterCost = prize - 0.08 * prize;
        } else if (season.equals("summer") && place.equals("Bulgaria")) {
            moneyAfterCost = prize - 0.05 * prize;
        } else if (season.equals("winter") && place.equals("Abroad")) {
            moneyAfterCost = prize - 0.15 * prize;
        } else if (season.equals("summer") && place.equals("Abroad")) {
            moneyAfterCost = prize - 0.10 * prize;
        }

        double charity = moneyAfterCost * 0.75;
        double rest = moneyAfterCost - charity;

        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", rest / dancerNumbers);
    }
}
