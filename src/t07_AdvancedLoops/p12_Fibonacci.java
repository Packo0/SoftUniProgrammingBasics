package t07_AdvancedLoops;

import java.util.Scanner;

public class p12_Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int f0 = 1;
        int f1 = 1;

        for (int i = 1; i < n; i++) {
            int sum = f0 + f1;
            f0 = f1;
            f1 = sum;
        }

        System.out.println(f1);
    }
}
