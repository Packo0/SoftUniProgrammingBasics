package t08_ExamPreparations.e14_17_July_2016;

import java.util.Scanner;

public class p02_Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int areaX = Integer.parseInt(scan.nextLine());
        double kgGrape = Double.parseDouble(scan.nextLine());
        int litresWine = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double totalGrape =areaX * kgGrape;
        double wine = 0.4 * totalGrape / 2.5;

        if(wine >= litresWine) {
            System.out.printf("Good harvest this year! Total wine: %d liters.%n", (int)wine);
            double litresLeft = wine - litresWine;
            double litresPerPerson = litresLeft / workers;
            System.out.printf("%d liters left -> %d liters per person.",
                    (int)Math.ceil(litresLeft),
                    (int)Math.ceil(litresPerPerson));
        } else {
            System.out.printf("It will be a tough winter! More %d liters wine needed." ,
                    (int)(litresWine - wine));
        }
    }
}
