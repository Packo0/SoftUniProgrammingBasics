package t08_ExamPreparations.e16_26_March_2016;

import java.util.Scanner;

public class p03_Trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String destination;
        String place;
        if(season.equals("summer")) {
            place = "Camp";
        } else {
            place = "Hotel";
        }

        double spend = 0;
        if (budget <= 100) {
            destination = "Bulgaria";

            if(season.equals("summer")) {
                spend = budget * 0.3;
            } else {
                spend = budget * 0.7;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";

            if(season.equals("summer")) {
                spend = budget * 0.4;
            } else {
                spend = budget * 0.8;
            }
        } else {
            destination = "Europe";
            spend = budget * 0.9;
            place = "Hotel";

        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, spend);
    }
}
