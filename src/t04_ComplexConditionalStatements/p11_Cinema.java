package t04_ComplexConditionalStatements;

import java.util.Scanner;

public class p11_Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projectionType = scan.nextLine();
        int row = Integer.parseInt(scan.nextLine());
        int col = Integer.parseInt(scan.nextLine());

        double price = -1;

        if (projectionType.equals("Premiere")) {
            price = 12.00;
        } else if (projectionType.equals("Normal")) {
            price = 7.50;
        } else if (projectionType.equals("Discount")) {
            price = 5.00;
        }

        double result = row * col * price;
        System.out.printf("%.2f", result);
    }
}