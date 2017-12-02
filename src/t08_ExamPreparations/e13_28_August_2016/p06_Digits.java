package t08_ExamPreparations.e13_28_August_2016;

import java.util.Scanner;

public class p06_Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int firstDigit = n / 100;
        int secondDigit = (n % 100) / 10;
        int thirdDigit = n % 10;
        int rows = firstDigit + secondDigit;
        int cols = firstDigit + thirdDigit;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if(n % 5 == 0) {
                    n -= firstDigit;
                } else if (n % 3 == 0) {
                    n -= secondDigit;
                } else {
                    n += thirdDigit;
                }

                System.out.print(n + " ");
            }

            System.out.println();
        }
    }
}
