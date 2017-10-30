package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p20_Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int xVineyard = Integer.parseInt(scan.nextLine());
        double yGrape = Double.parseDouble(scan.nextLine());
        int zLitresWine = Integer.parseInt(scan.nextLine());
        int workersCount = Integer.parseInt(scan.nextLine());

        double totalGrape = xVineyard * yGrape;
        double wine = 0.4 * totalGrape / 2.5;

        if(wine >= zLitresWine) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            double left = wine - zLitresWine;
            double litresPerWorker = left / workersCount;
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(left), Math.ceil(litresPerWorker));
        } else {
            double litres = zLitresWine - wine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(litres));
        }


    }
}
