package t08_ExamPreparations.e14_17_July_2016;

import java.util.Scanner;

public class p04_BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        int year = Integer.parseInt(scan.nextLine());

        int years = 18;
        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                money -= 12000;
            } else {
                money -= 12000 + 50 * years;
            }

            years++;
        }

        if(money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
