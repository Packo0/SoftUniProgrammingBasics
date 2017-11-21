package t07_AdvancedLoops;

import java.util.Scanner;

public class p09_SumDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        while (n > 0) {
            sum +=  n % 10;

            n /= 10;
        }

        System.out.println(sum);
    }
}
