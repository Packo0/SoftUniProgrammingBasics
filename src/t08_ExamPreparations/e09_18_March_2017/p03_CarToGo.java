package t08_ExamPreparations.e09_18_March_2017;

import java.util.Scanner;

public class p03_CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String carClass = "";
        String carType;
        double price = 0;
        if(budget <= 100) {
            carClass = "Economy class";

            if(season.equals("Summer")) {
                price = budget * 35/100;
            } else {
                price = budget * 0.65;
            }
        } else if (100 < budget && budget <= 500) {
            carClass = "Compact class";

            if(season.equals("Summer")) {
                price = budget * 0.45;
            } else {
                price = budget * 0.80;
            }
        }


        if(season.equals("Summer")) {
            carType = "Cabrio";
        } else {
            carType = "Jeep";
        }

        if (budget > 500){
            carClass = "Luxury class";
            carType = "Jeep";
            price = budget * .90;
        }

        System.out.printf("%s%n%s - %.2f", carClass, carType, price);
    }
}
