package t08_ExamPreparations.e01_05_November_2017;

import java.util.Scanner;

public class p01_WireNet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int longitude = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        double weight = Double.parseDouble(scan.nextLine());

        double perimeter = 2*(longitude + width);

        System.out.printf("%.0f%n", perimeter);

        double netPrice = perimeter * price;
        System.out.printf("%.2f%n", netPrice);

        double area = perimeter * height;

        double netWeight = area * weight;
        System.out.printf("%.3f", netWeight);
    }
}
