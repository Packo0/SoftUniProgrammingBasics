package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p04_GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numberOne = Double.parseDouble(scan.nextLine());
        double numberTwo = Double.parseDouble(scan.nextLine());

        if (numberOne >= numberTwo) {
            System.out.println(numberOne);
        } else {
            System.out.println(numberTwo);
        }
    }
}
