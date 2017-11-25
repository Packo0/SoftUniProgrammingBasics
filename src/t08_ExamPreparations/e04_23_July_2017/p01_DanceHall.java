package t08_ExamPreparations.e04_23_July_2017;

import java.util.Scanner;

public class p01_DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double longitude = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double a = Double.parseDouble(scan.nextLine());

        double areaHall = longitude * width * 100 * 100; //in centimeters
        double areaWardrobe = a * a * 100 * 100; //in centimeters
        double areaBench = areaHall / 10;
        double freeSpace = areaHall - areaBench - areaWardrobe;
        double dancers = freeSpace / (40 + 7000);

        System.out.printf("%d", (int)dancers);


    }
}
