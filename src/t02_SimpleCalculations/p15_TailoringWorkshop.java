package t02_SimpleCalculations;

import java.util.Scanner;

public class p15_TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tables = Integer.parseInt(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());

        double areaRect = tables * ((length + 2 * 0.3) * (width + 2 * 0.3));
        double areaSquare =  tables * (length / 2.0) * (length / 2.0);

        double priceUsd = areaRect * 7 + areaSquare * 9;
        double priceBgn = priceUsd * 1.85;

        System.out.printf("%.2f USD%n", priceUsd);
        System.out.printf("%.2f BGN", priceBgn);

    }
}
