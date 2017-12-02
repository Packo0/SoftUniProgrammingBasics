package t08_ExamPreparations.e14_17_July_2016;

import java.util.Scanner;

public class p05_Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int width = 5 * n;
        int height = 3 * n + 2;

        //top
        int leftRight = n;
        int middle = width - 2 * leftRight - 2;
        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr(".", leftRight));
            System.out.print("*");
            if (i == 0) {
                System.out.print(repeatStr("*", middle));
            } else {
                System.out.print(repeatStr(".", middle));
            }
            System.out.print("*");
            System.out.println(repeatStr(".", leftRight));

            leftRight--;
            middle += 2;
        }

        //middle row
        System.out.println(repeatStr("*", width));

        //down
        leftRight = 1;
        middle -= 2;
        for (int i = 0; i < height - n - 1; i++) {
            System.out.print(repeatStr(".", leftRight));
            System.out.print("*");

            if (i == height - n - 2) {
                System.out.print(repeatStr("*", middle));
            } else {
                System.out.print(repeatStr(".", middle));
            }

            System.out.print("*");

            System.out.println(repeatStr(".", leftRight));


            leftRight++;
            middle -= 2;
        }
    }

    private static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
