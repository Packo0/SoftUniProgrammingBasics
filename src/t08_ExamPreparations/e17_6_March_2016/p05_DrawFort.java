package t08_ExamPreparations.e17_6_March_2016;

import java.util.Scanner;

public class p05_DrawFort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //roof
        System.out.print("/");

        int middle = n / 2;
        int underscores = 2 * n - 2 * middle - 4;
        System.out.print(repeatString("^", middle));
        System.out.print("\\");
        System.out.print(repeatString("_", underscores));
        System.out.print("/");
        System.out.print(repeatString("^", middle));
        System.out.println("\\");

        //body
        for (int i = 0; i < n - 3; i++) {
            System.out.print("|");
            System.out.print(repeatString(" ", 2 * n - 2));
            System.out.println("|");
        }

        //row  before last
        System.out.print("|");
        System.out.print(repeatString(" ", middle + 1));
        System.out.print(repeatString("_", underscores));
        System.out.print(repeatString(" ", middle + 1));
        System.out.println("|");

        //last row
        System.out.print("\\");
        System.out.print(repeatString("_", middle));
        System.out.print("/");
        System.out.print(repeatString(" ", underscores));
        System.out.print("\\");
        System.out.print(repeatString("_", middle));
        System.out.println("/");

    }

    private static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
