package t08_ExamPreparations.e02_17_September_2017;

import java.util.Scanner;

public class p06_TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        boolean isPassword = false;
        String password = "";
        int count = 0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d && (a * b + c * d) == n) {
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                            count++;

                            if(count == 4) {
                                isPassword = true;
                                password = "" + a + b + c + d;
                            }
                        }
                    }
                }
            }
        }

        System.out.println();
        if(isPassword) {
            System.out.printf("Password: %s", password);
        } else {
            System.out.println("No!");
        }
    }
}
