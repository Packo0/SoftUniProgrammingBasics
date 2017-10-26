package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p15_3EqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        if (num1 == num2 && num1 == num3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
