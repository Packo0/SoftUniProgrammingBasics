package t07_AdvancedLoops;

import java.util.Scanner;

public class p08_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
