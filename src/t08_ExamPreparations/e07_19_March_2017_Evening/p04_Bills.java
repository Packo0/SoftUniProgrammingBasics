package t08_ExamPreparations.e07_19_March_2017_Evening;

import java.util.Scanner;

public class p04_Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int months = Integer.parseInt(scan.nextLine());

        double totalSum = 0;
        double electricityTotal = 0;
        double other = 0;
        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scan.nextLine());
            electricityTotal += electricity;

            totalSum += electricity + 20 + 15;

            other = totalSum + 0.2 * totalSum;
        }

        System.out.printf("Electricity: %.2f lv%n", electricityTotal);
        System.out.printf("Water: %.2f lv%n", months * 20.0);
        System.out.printf("Internet: %.2f lv%n", months * 15.0);
        System.out.printf("Other: %.2f lv%n", other);
        System.out.printf("Average: %.2f lv", (totalSum + other) / months);
    }
}
