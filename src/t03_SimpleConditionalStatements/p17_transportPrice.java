package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p17_transportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String str = scan.nextLine();

        //taxi
        double taxiPrice = 0;
        if (str.equals("day")) {
            taxiPrice = 0.7 + 0.79 * n;
        } else {
            taxiPrice = 0.7 + 0.90 * n;
        }

        //bus
        double busPrice = 0;

        if (n >= 20) {
            busPrice = n * 0.09;
        }

        //train
        double trainPrice = 0;
        if (n >= 100) {
            trainPrice = n * 0.06;
        }

        if (n < 20) {
            System.out.printf("%.2f", taxiPrice);
        } else {
            if (trainPrice == 0) {
                System.out.printf("%.2f", Math.min(busPrice, taxiPrice));
            } else {
                System.out.printf("%.2f", Math.min(trainPrice, taxiPrice));
            }
        }
    }
}
