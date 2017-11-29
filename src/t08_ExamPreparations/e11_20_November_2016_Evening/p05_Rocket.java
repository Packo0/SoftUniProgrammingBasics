package t08_ExamPreparations.e11_20_November_2016_Evening;

import java.util.Scanner;

public class p05_Rocket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int width = 3 * n;

        //roof
        int dots = (width - 2) / 2;
        int spaces = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr(".", dots));
            System.out.print("/");
            System.out.print(repeatStr(" ", spaces));
            System.out.print("\\");
            System.out.println(repeatStr(".", dots));

            dots--;
            spaces += 2;
        }

        //middle row
        dots++;
        System.out.print(repeatStr(".", dots));
        System.out.print(repeatStr("*", spaces));
        System.out.println(repeatStr(".", dots));

        //base
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(repeatStr(".", dots));
            System.out.print("|");
            System.out.print(repeatStr("\\", spaces - 2));
            System.out.print("|");
            System.out.println(repeatStr(".", dots));
        }

        //bottom
        for (int i = 0; i < n / 2; i++) {
            System.out.print(repeatStr(".", dots));
            System.out.print("/");
            System.out.print(repeatStr("*", spaces - 2));
            System.out.print("\\");
            System.out.println(repeatStr(".", dots));

            dots--;
            spaces += 2;
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
