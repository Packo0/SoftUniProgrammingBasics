package t08_ExamPreparations.e03_03_September_2017;

import java.util.Scanner;

public class p01_TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countTables = Integer.parseInt(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        double totalArea = countTables * (width + 2*0.3) * (height + 2 * 0.3);
        double totalSquare = countTables * (width / 2) * (width / 2);

        double totalUSD = totalArea * 7 + totalSquare * 9;
        double totalBGN = totalUSD * 1.85;
        System.out.printf("%.2f USD%n", totalUSD);
        System.out.printf("%.2f BGN", totalBGN);
    }
}
