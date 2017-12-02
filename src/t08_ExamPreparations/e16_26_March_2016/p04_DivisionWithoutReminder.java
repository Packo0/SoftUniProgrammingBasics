package t08_ExamPreparations.e16_26_March_2016;

import java.util.Scanner;

public class p04_DivisionWithoutReminder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());

            if(currentNum % 2 == 0) {
                p1++;
            }

            if (currentNum % 3 == 0) {
                p2++;
            }

            if (currentNum % 4 == 0) {
                p3++;
            }
        }

        System.out.printf("%.2f%%%n", p1 / n * 100);
        System.out.printf("%.2f%%%n", p2 / n * 100);
        System.out.printf("%.2f%%%n", p3 / n * 100);
    }
}
