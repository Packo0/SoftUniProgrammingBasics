package t08_ExamPreparations.e05_25_June_2017;

import java.util.Scanner;

public class p01_CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        int cake = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double priceCakes = 45 * cake;
        double priceWaffles = 5.80 * waffles;
        double pricePancakes = 3.20 * pancakes;

        double totalAmountForDay = (priceCakes + pricePancakes + priceWaffles) * people;
        double totalAmountForCampaign = totalAmountForDay * days;
        double totalAmountAfterExpances = totalAmountForCampaign - 1 / 8.0 * totalAmountForCampaign;

        System.out.printf("%.2f", totalAmountAfterExpances);
    }
}
