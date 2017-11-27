package t08_ExamPreparations.e05_25_June_2017;

import java.util.Scanner;

public class p04_MoneyPrize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pieces = Integer.parseInt(scan.nextLine());
        double moneyForPoint = Double.parseDouble(scan.nextLine());

        double points = 0;
        for (int i = 1; i <= pieces; i++) {
            double currentPartPoints = Double.parseDouble(scan.nextLine());

            if(i % 2 == 0) {
                points += currentPartPoints * 2;
            } else {
                points += currentPartPoints;
            }
        }

        System.out.printf("The project prize was %.2f lv.", points * moneyForPoint);
    }
}
