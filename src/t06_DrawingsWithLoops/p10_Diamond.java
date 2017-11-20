package t06_DrawingsWithLoops;

import java.util.Scanner;

public class p10_Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int asterisk, mid;
        if (n % 2 == 0) {
            asterisk = 2;
            mid = 2;
        } else {
            asterisk = 1;
            mid = 1;
        }

        if (n == 1) {
            System.out.println("*");
            return;
        } else if (n == 2) {
            System.out.println("**");
            return;
        }
        int leftRight = (n - 1) / 2;
        //firstRow
        System.out.print(repeatString("-", leftRight));
        System.out.print(repeatString("*", asterisk));
        System.out.println(repeatString("-", leftRight));

        for (int i = 1; i <= (n - 1) / 2; i++) {
            leftRight--;

            System.out.print(repeatString("-", leftRight));
            System.out.print("*");
            System.out.print(repeatString("-", mid));
            System.out.print("*");
            System.out.println(repeatString("-", leftRight));
//            leftRight--;
            mid += 2;
        }

        mid -= 4;
//        System.out.println("----------------------");

        for (int i = 1; i < (n - 1) / 2; i++) {
            leftRight++;

            System.out.print(repeatString("-", leftRight));
            System.out.print("*");
            System.out.print(repeatString("-", mid));
            System.out.print("*");
            System.out.println(repeatString("-", leftRight));
//            leftRight--;
            mid -= 2;
        }

        leftRight++;

        //lastRow
        System.out.print(repeatString("-", leftRight));
        System.out.print(repeatString("*", asterisk));
        System.out.println(repeatString("-", leftRight));

    }

    private static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
