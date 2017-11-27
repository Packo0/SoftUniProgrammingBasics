package t08_ExamPreparations.e05_25_June_2017;

import java.util.Scanner;

public class p06_AddOrMultriply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        boolean flag = true;
        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {
                    if ((a + b + c == n) && (a < b) && (b < c)) {
                        System.out.printf("%d + %d + %d = %d%n", a, b, c, n);
                        flag = false;
                    }

                    if (a * b * c == n && a > b && b > c) {
                        System.out.printf("%d * %d * %d = %d%n", a, b, c, n);
                        flag = false;
                    }
                }
            }
        }

        if (flag) {
            System.out.println("No!");
        }
    }
}
