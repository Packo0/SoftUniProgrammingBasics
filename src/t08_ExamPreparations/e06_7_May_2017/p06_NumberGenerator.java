package t08_ExamPreparations.e06_7_May_2017;

import java.util.Scanner;

public class p06_NumberGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int special = Integer.parseInt(scan.nextLine());
        int control = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= l; k++) {
                    if ((i + j + k) % 3 == 0) {
                        special += 2;
                    }

                    if (k % 2 == 0) {
                        special *= 2;
                    }

                    if (k % 5 == 0) {
                        special -= 2;
                    }

                }
            }
        }
    }
}
