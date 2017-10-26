package t02_SimpleCalculations;

import java.util.Scanner;

public class p08_TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double side = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        double area = side * height / 2;

        System.out.printf("%.2f", area);
    }
}
