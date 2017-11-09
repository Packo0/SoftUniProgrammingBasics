package t05_Loops;

import java.util.Scanner;

public class p12_EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int oldSum = 0;
        int oldDiff = 0;
        int max = Integer.MIN_VALUE;
        boolean isPairValueEqual = true;

        for (int i = 0; i < n; i++) {
            int pairNumOne = Integer.parseInt(scan.nextLine());
            int pairNumTwo = Integer.parseInt(scan.nextLine());

            int currentSum = pairNumOne + pairNumTwo;
            int currentDiff = Math.abs(currentSum - oldSum);

            if(currentDiff != oldDiff && i > 0){
                isPairValueEqual = false;
            }

            if(currentDiff > max && i > 0) {
                max = currentDiff;
            }

            oldSum = currentSum;
            if(i > 0) {
                oldDiff = currentDiff;
            }
        }

        if (isPairValueEqual) {
            System.out.printf("Yes, value=%d", oldSum);
        } else {
            System.out.printf("No, maxdiff=%d", max);
        }
    }
}
