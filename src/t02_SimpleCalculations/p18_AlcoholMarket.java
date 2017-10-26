package t02_SimpleCalculations;

import java.util.Scanner;

public class p18_AlcoholMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceWhiskey = Double.parseDouble(scan.nextLine());
        double beer = Double.parseDouble(scan.nextLine());
        double wine = Double.parseDouble(scan.nextLine());
        double rakia = Double.parseDouble(scan.nextLine());
        double whiskey = Double.parseDouble(scan.nextLine());

        double totalPrice = (priceWhiskey * whiskey) + (rakia * priceWhiskey / 2) + (wine * (priceWhiskey / 2 - (priceWhiskey / 2) * 0.4)) +
                (beer * (priceWhiskey / 2 - (priceWhiskey / 2) * 0.8));

        System.out.printf("%.2f", totalPrice);

    }
}