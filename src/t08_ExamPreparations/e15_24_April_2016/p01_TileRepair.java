package t08_ExamPreparations.e15_24_April_2016;

import java.util.Scanner;

public class p01_TileRepair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double w = Double.parseDouble(scan.nextLine());
        double l = Double.parseDouble(scan.nextLine());
        double m = Double.parseDouble(scan.nextLine());
        double o = Double.parseDouble(scan.nextLine());

        double areaSquare = n * n;
        double benchArea = m * o;
        double coverArea = areaSquare - benchArea;
        double tileArea = w * l;
        double tileNeeded = coverArea / tileArea;
        double time = tileNeeded * 0.2;

        System.out.printf("%.2f%n", tileNeeded);
        System.out.printf("%.2f", time);
    }
}
