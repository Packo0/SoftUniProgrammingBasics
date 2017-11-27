package t08_ExamPreparations.e06_7_May_2017;

import java.util.Scanner;

public class p01_AlcoholMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceWhiskey = Double.parseDouble(scan.nextLine());
        double beer = Double.parseDouble(scan.nextLine());
        double wine = Double.parseDouble(scan.nextLine());
        double rakiq = Double.parseDouble(scan.nextLine());
        double whiskey = Double.parseDouble(scan.nextLine());

        double rakiqPrice = priceWhiskey / 2;
        double winePrice = rakiqPrice - 0.4 * rakiqPrice;
        double beerPrice = rakiqPrice - 0.8 * rakiqPrice;

        double totalSum = whiskey * priceWhiskey + beer * beerPrice + wine * winePrice + rakiq * rakiqPrice;

        System.out.printf("%.2f", totalSum);
    }
}
