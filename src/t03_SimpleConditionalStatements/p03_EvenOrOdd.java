package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p03_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
