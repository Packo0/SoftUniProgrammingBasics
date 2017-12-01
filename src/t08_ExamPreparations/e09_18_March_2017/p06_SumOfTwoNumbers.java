package t08_ExamPreparations.e09_18_March_2017;

import java.util.Scanner;

public class p06_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int begin = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());

        int count = 0;
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                count++;

                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, i + j);
                    return;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d", count, magicNumber);
    }
}
