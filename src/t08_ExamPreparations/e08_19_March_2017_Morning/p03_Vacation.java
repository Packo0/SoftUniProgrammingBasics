package t08_ExamPreparations.e08_19_March_2017_Morning;

import java.util.Scanner;

public class p03_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String place = "";
        String location = "";
        double price = 0;
        if(budget <= 1000) {
            place = "Camp";

            if(season.equals("Summer")) {
                price = budget * 0.65;
            } else {
                price = budget * 0.45;
            }
        } else if (1000 < budget && budget <= 3000) {
            place = "Hut";

            if(season.equals("Summer")) {
                price = budget * 0.80;
            } else {
                price = budget * 0.60;
            }
        } else {
            place = "Hotel";
            price = budget * .90;
        }

        if(season.equals("Summer")) {
            location = "Alaska";
        } else {
            location = "Morocco";
        }

        System.out.printf("%s - %s - %.2f", location, place, price);
    }
}
