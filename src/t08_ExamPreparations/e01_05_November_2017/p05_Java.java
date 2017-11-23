package t08_ExamPreparations.e01_05_November_2017;

import java.util.Scanner;

public class p05_Java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //up part
        for (int i = 0; i < n; i++) {
            System.out.print(repeatString(" ", n));
            System.out.println(repeatString("~ ", 3));
        }

        //equal up row
        for (int i = 0; i < 3 * n + 5; i++) {
            System.out.print("=");
        }

        System.out.println();

        //java part
        for (int i = 0; i < n - 2; i++) {
            System.out.print("|");
            if (i == (n - 2) / 2) {
                System.out.print(repeatString("~", n));
                System.out.print("JAVA");
                System.out.print(repeatString("~", n));
            } else {
                System.out.print(repeatString("~", 3 * n + 6 - 2 - n));
            }
            System.out.print("|");
            System.out.print(repeatString(" ", n - 1));
            System.out.println("|");
        }

        //equal down row
        for (int i = 0; i < 3 * n + 5; i++) {
            System.out.print("=");
        }

        System.out.println();

        //bottom part
        int spaces = 0;
        int at = (n - 1) * 2 + 6;

        for (int i = 0; i < n; i++) {
            System.out.print(repeatString(" ", spaces));
            System.out.print("\\");
            System.out.print(repeatString("@", at));
            System.out.println("/");
            spaces++;
            at -= 2;
        }

        System.out.println(repeatString("=", 3 * n + 6 - n));
    }

    private static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
