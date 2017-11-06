package t05_Loops;

import java.util.Scanner;

public class p07_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double leftSum = 0;
        double rightSum = 0;

        for (int i = 0; i < n; i++) {
            double currentNum = Integer.parseInt(scan.nextLine());
            leftSum += currentNum;
        }

        for (int i = 0; i < n; i++) {
            double currentNum = Integer.parseInt(scan.nextLine());
            rightSum += currentNum;
        }

        double diff = Math.abs(leftSum - rightSum);


        if(diff == 0) {
            System.out.printf("Yes, sum = %f", leftSum);
        } else {
            System.out.printf("No, diff = %f", diff);
        }
    }
}
