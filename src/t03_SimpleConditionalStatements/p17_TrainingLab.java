package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p17_TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();
        double taxiPrice;
        double busPrice = -1;
        double trainPrice = -1;

        //taxi
        double initialPrice = 0.7;
        double dayPrice = 0.79;
        double nightPrice = 0.9;

        if (day.equals("day")) {
            taxiPrice = n * initialPrice * dayPrice;
        } else {
            taxiPrice = n * initialPrice * nightPrice;
        }

        if (n >= 20) { //bus
            double pricePerKm = 0.79;
            busPrice = n * pricePerKm;
        }

        if (n >= 100) { //train
            double pricePerKm = 0.06;
            trainPrice = n * pricePerKm;
        }

        double lowestPrice = 0;
        if (taxiPrice > 0 || busPrice > 0 || trainPrice > 0) {
             lowestPrice = Math.min(Math.min(taxiPrice, busPrice), trainPrice);

        }

        System.out.println(lowestPrice);
    }
}
