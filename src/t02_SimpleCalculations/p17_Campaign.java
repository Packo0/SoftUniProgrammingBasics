package t02_SimpleCalculations;

import java.util.Scanner;

public class p17_Campaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int gofretes = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        int priceCakes = cakes * 45;
        double priceGofretes = gofretes * 5.8;
        double pricePanCakes = pancakes * 3.2;

        double totalPriceOneDay = people * (priceCakes + priceGofretes + pricePanCakes);
        double totalPriceAllCampaign = totalPriceOneDay * days;

        double result = totalPriceAllCampaign - totalPriceAllCampaign / 8.0;

        System.out.printf("%.2f", result);


    }
}
