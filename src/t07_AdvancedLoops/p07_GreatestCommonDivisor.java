package t07_AdvancedLoops;

import java.util.Scanner;

public class p07_GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);
    }
}
