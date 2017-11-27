package t08_ExamPreparations.e07_19_March_2017_Evening;

import java.util.Scanner;

public class p01_GrapeAndRakiq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());
        double kgPerMeter = Double.parseDouble(scan.nextLine());
        double brack = Double.parseDouble(scan.nextLine());

        double grape = area * kgPerMeter;
        double grapeLeft = grape - brack;

        double rakiq = 0.45 * grapeLeft;
        double forSale = 0.55 * grapeLeft;
        double litres = rakiq / 7.5;
        double income = litres * 9.8;

        System.out.printf("%.2f%n", income);
        System.out.printf("%.2f", forSale * 1.5);
    }
}
