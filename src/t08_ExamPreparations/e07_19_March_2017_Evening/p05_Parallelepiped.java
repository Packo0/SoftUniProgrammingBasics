package t08_ExamPreparations.e07_19_March_2017_Evening;

import java.util.Scanner;

public class p05_Parallelepiped {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //first row
        System.out.print("+");
        System.out.print(repeatStr("~", n - 2));
        System.out.print("+");
        System.out.println(repeatStr(".", 2 * n + 1));

        //second row
        System.out.print("|\\");
        System.out.print(repeatStr("~", n - 2));
        System.out.print("\\");
        System.out.println(repeatStr(".", 2 * n));

        //top part
        int dots = 1;
        for (int i = 0; i < 2 * n; i++) {
            System.out.print("|");
            System.out.print(repeatStr(".", dots));
            System.out.print("\\");
            System.out.print(repeatStr("~", n - 2));
            System.out.print("\\");
            System.out.println(repeatStr(".", 2 * n - i -1));

            dots++;
        }

        //bottom part
        int leftDots = 0;
        int rightDots = 2 * n;
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(repeatStr(".", leftDots));
            System.out.print("\\");
            System.out.print(repeatStr(".", rightDots));
            System.out.print("|");
            System.out.print(repeatStr("~", n - 2));
            System.out.println("|");

            leftDots++;
            rightDots--;
        }

        //second row
        System.out.print(repeatStr(".", 2 * n));
        System.out.print("\\|");
        System.out.print(repeatStr("~", n - 2));
        System.out.println("|");

        //last row
        System.out.print(repeatStr(".", 2 * n + 1));
        System.out.print("+");
        System.out.print(repeatStr("~", n - 2));
        System.out.println("+");

    }

    private static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
