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
        System.out.print(repeatStr(" ", (width - 3) / 2));
        System.out.print("@");
        System.out.print(repeatStr(" ", (width - 3) / 2));
        System.out.println("@");

        //second row
        System.out.print("**");
        System.out.print(repeatStr(" ", (width - 4) / 2));
        System.out.print("*");
        System.out.print(repeatStr(" ", (width - 4) / 2));
        System.out.println("**");

        int dots = 1;
        int spaces = (width - 3) / 2 - 2;
        int middle = 1;
        for (int i = 0; i < height - 5; i++) {


            if(i == height - 4) {
                System.out.print("*");
                System.out.print(repeatStr(".", dots));
                System.out.print("*");
                System.out.print(repeatStr(".", middle));
                System.out.print("*");
                System.out.print(repeatStr(".", dots));
                System.out.println("*");
            } else {
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
            }

            dots++;
            middle += 2;
            spaces -= 2;
        }

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
