package t07_AdvancedLoops;

import java.util.Scanner;

public class p14_NumberTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int num = 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row + col + 1 <= n) {
                    System.out.print(row + col + 1 + " ");
                } else {
                    System.out.print(2 * n - row - col - 1 + " ");
                }
            }

            System.out.println();
        }
    }
}
