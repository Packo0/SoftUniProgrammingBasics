package t08_ExamPreparations.e08_19_March_2017_Morning;

import java.util.Scanner;

public class p05_Hourglass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int width = 2 * n + 1;
        int height = 2 * n + 1;

        //first row
        System.out.println(repeatStr("*", width));
        //second row
        System.out.print(".*");
        System.out.print(repeatStr(" ", width - 4));
        System.out.println("*.");

        //middle upper part
        int dots = 2;
        int at = width - 2 * dots - 2;
        for (int i = 0; i < n - 2; i++) {
            System.out.print(repeatStr(".", dots));
            System.out.print("*");
            System.out.print(repeatStr("@", at));
            System.out.print("*");
            System.out.println(repeatStr(".", dots));

            dots++;
            at -= 2;
        }

        //middle row
        System.out.print(repeatStr(".", dots));
        System.out.print("*");
        System.out.println(repeatStr(".", dots));

        //middle down part
        dots--;
        int spaces = 0;
        for (int i = 0; i < n - 2; i++) {
            System.out.print(repeatStr(".", dots));
            System.out.print("*");
            System.out.print(repeatStr(" ", spaces));
            System.out.print("@");
            System.out.print(repeatStr(" ", spaces));
            System.out.print("*");
            System.out.println(repeatStr(".", dots));

            dots--;
            spaces++;
        }

        //before last row
        System.out.print(".*");
        System.out.print(repeatStr("@", width - 4));
        System.out.println("*.");

        //last row
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
