package t04_ComplexConditionalStatements;

import java.util.Scanner;

public class p15_Trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        if(money <= 100) {
            System.out.println("Somewhere in Bulgaria");

            if (season.equals("summer")) {
                System.out.printf("Camp - %.2f", money * 0.3);
            } else {
                System.out.printf("Hotel - %.2f", money * 0.7);
            }
        } else if (100 < money && money <= 1000) {
            System.out.println("Somewhere in Balkans");

            if (season.equals("summer")) {
                System.out.printf("Camp - %.2f", money * 0.4);
            } else {
                System.out.printf("Hotel - %.2f", money * 0.8);
            }
        } else {
            System.out.println("Somewhere in Europe");

            if (season.equals("summer")) {
                System.out.printf("Hotel - %.2f", money * 0.9);
            } else {
                System.out.printf("Hotel - %.2f", money * 0.9);
            }
        }

    }
}
