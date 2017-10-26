package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p01_ExcellentResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mark = Double.parseDouble(scan.nextLine());

        if (mark >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}
