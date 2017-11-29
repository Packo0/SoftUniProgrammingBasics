package t08_ExamPreparations.e10_18_December_2016;

import java.util.Scanner;

public class p05_ChristmasHat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int width = 4 * n + 1;
        int height = 2 * n + 5;

        //top
        int dots = (width - 3) / 2;
        //first row
        System.out.print(repeatStr(".", dots));
        System.out.print("/|\\");
        System.out.println(repeatStr(".", dots));

        //second row
        System.out.print(repeatStr(".", dots));
        System.out.print("\\|/");
        System.out.println(repeatStr(".", dots));

        //middle part
        int dashes = 0;
        for (int i = 0; i < height - 5; i++) {
            System.out.print(repeatStr(".", dots));
            System.out.print("*");
            System.out.print(repeatStr("-", dashes));
            System.out.print("*");
            System.out.print(repeatStr("-", dashes));
            System.out.print("*");
            System.out.println(repeatStr(".", dots));

            dots--;
            dashes++;
        }

        //last rows
        System.out.println(repeatStr("*", width));
        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }

        System.out.println();
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
