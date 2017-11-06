package t05_Loops;

import java.util.Scanner;

public class p08_OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double oddSum = 0;
        double evenSum = 0;
        for (int i = 0; i < n; i++) {
            double currentNum = Double.parseDouble(scan.nextLine());

            if (i % 2 == 0) {
                evenSum += currentNum;
            } else {
                oddSum += currentNum;
            }
        }

        double diff = Math.abs(evenSum - oddSum);
        if (diff == 0) {
            System.out.printf("Yes %nSum = %.0f", evenSum);
        } else {
            System.out.printf("No %nDiff = %.0f", diff);
        }
    }
}
