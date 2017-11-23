package t08_ExamPreparations.e01_05_November_2017;

import java.util.Scanner;

public class p03_CourierExpress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight = Double.parseDouble(scan.nextLine());
        String type = scan.nextLine();
        int distance = Integer.parseInt(scan.nextLine());

        double result = 1;

        if (type.equals("standard")) {
            if (weight < 1) {
                result *= 0.03 * distance;
            } else if (weight < 10) {
                result *= 0.05 * distance;
            } else if (weight < 40) {
                result *= 0.10 * distance;
            } else if (weight < 90) {
                result *= 0.15 * distance;
            } else if (weight < 150) {
                result *= 0.20 * distance;
            }
        } else {
            if (weight < 1) {
                result *= 0.8 * 0.03 * distance * weight;
                result += 0.03 * distance;

            } else if (weight < 10) {
                result *= 0.4 * 0.05 * distance * weight;
                result += 0.05 * distance;

            } else if (weight < 40) {
                result *= 0.05 * 0.10 * distance * weight;
                result += 0.10 * distance;

            } else if (weight < 90) {
                result *= 0.02 * 0.15 * distance * weight;
                result += 0.15 * distance;

            } else if (weight < 150) {
                result *= 0.01 * 0.20 * distance * weight;
                result += 0.20 * distance;

            }
        }

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, result);
    }
}
