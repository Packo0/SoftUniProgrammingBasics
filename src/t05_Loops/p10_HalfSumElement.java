package t05_Loops;

import java.util.Scanner;

public class p10_HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.parseInt(scan.nextLine());
        int sum = max;


        for (int i = 0; i < n - 1; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            if(currentNum > max) {
                max = currentNum;
            }

            sum += currentNum;
        }

        if(max == sum - max) {
            System.out.printf("Yes%nSum=%d", max);
        } else {
            System.out.printf("No%nDiff=%d", (int)Math.abs(max - (sum-max)));
        }
    }
}
