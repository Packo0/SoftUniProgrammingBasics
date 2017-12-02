package t08_ExamPreparations.e15_24_April_2016;

import java.util.Scanner;

public class p04_SmartLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double washingMachineCost = Double.parseDouble(scan.nextLine());
        int toyCost = Integer.parseInt(scan.nextLine());
        int lilyMoney = 0;
        int sum = 0;
        int numberOfToys = 0;

        for (int i = 1; i <= age; i++) {
            if(i % 2 == 0) {
                lilyMoney += 10;
                sum += lilyMoney;
            } else {
                numberOfToys++;
            }
        }

        int moneyLeft = sum + numberOfToys * toyCost - age / 2;

        if(moneyLeft < washingMachineCost) {
            System.out.printf("No! %.2f", washingMachineCost - moneyLeft);
        } else {
            System.out.printf("Yes! %.2f", moneyLeft - washingMachineCost);
        }
    }

}
