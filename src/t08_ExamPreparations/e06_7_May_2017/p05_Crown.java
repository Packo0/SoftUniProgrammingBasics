package t08_ExamPreparations.e06_7_May_2017;

import java.util.Scanner;

public class p05_Crown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int width = 2 * n - 1;
        int height = n / 2 + 4;

        //top
        System.out.print("@");
        System.out.print(repeatStr(" ", ((2 * n) - 4) / 2));
        System.out.print("@");
        System.out.print(repeatStr(" ", ((2 * n) - 4) / 2));
        System.out.println("@");

        //second
        System.out.print("**");
        System.out.print(repeatStr(" ", ((2 * n) - 6) / 2));
        System.out.print("*");
        System.out.print(repeatStr(" ", ((2 * n) - 6) / 2));
        System.out.println("**");

        int dots = 1;
        int spaces = ((2 * n) - 10) / 2;
        int middle = 1;
        for (int i = 0; i < n / 2 - 2; i++) {
            System.out.print("*");
            System.out.print(repeatStr(".", dots));
            System.out.print("*");
            System.out.print(repeatStr(" ", spaces));
            System.out.print("*");
            System.out.print(repeatStr(".", middle));
            System.out.print("*");
            System.out.print(repeatStr(" ", spaces));
            System.out.print("*");
            System.out.print(repeatStr(".", dots));
            System.out.println("*");

            dots++;
            middle += 2;
            spaces -= 2;
        }

        int d = ((n * 2) - 1) - (((n / 2 - 1) * 2) + 4);
        System.out.printf("*%s*%s*%s*%n",
                repeatStr(".", n / 2 - 1),
                repeatStr(".", d),
                repeatStr(".", n / 2 - 1));

        int bottomDot = (((2 * n) - 1) - (n + 3)) / 2;
        System.out.printf("*%s%s.%s%s*%n",
                repeatStr(".", n / 2),
                repeatStr("*", bottomDot),
                repeatStr("*", bottomDot),
                repeatStr(".", n / 2));

        //bottom
        System.out.println(repeatStr("*", width));
        System.out.println(repeatStr("*", width));
    }

    private static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
