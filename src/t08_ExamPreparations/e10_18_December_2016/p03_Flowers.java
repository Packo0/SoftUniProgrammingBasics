package t08_ExamPreparations.e10_18_December_2016;

import java.util.Scanner;

public class p03_Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chrysanthemumsCount = Integer.parseInt(scan.nextLine());
        int rosesCount = Integer.parseInt(scan.nextLine());
        int tulipsCount = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        String holiday = scan.nextLine();

        double flowerCost = 0;
        if (season.equals("Spring") || season.equals("Summer")) {
            flowerCost = chrysanthemumsCount * 2 + rosesCount * 4.1 + tulipsCount * 2.5;
        } else {
            flowerCost = chrysanthemumsCount * 3.75 + rosesCount * 4.5 + tulipsCount * 4.15;
        }

        if (holiday.equals("Y")) {
            flowerCost += flowerCost * 0.15;
        }

        if (season.equals("Spring") && tulipsCount > 7) {
            flowerCost -= flowerCost * 0.05;
        }

        if (season.equals("Winter") && rosesCount >= 10) {
            flowerCost -= flowerCost * 0.1;
        }

        if (chrysanthemumsCount + rosesCount + tulipsCount >= 20) {
            flowerCost -= flowerCost * 0.2;
        }

        System.out.printf("%.2f", flowerCost + 2);

    }
}
