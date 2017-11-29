package t08_ExamPreparations.e08_19_March_2017_Morning;

import java.util.Scanner;

public class p01_HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double sides = 2 * x * y - 2 * 1.5 * 1.5;
        double back = x * x;
        double frontBack = 2 * back - 2.4;
        double totalArea = sides + frontBack;
        System.out.printf("%.2f%n", totalArea / 3.4);

        double roof = 2 * x * y + 2 * x * h / 2;
        System.out.printf("%.2f", roof / 4.3);
    }
}
