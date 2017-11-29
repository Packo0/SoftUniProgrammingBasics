package t08_ExamPreparations.e12_20_November_2016_Morning;

import java.util.Scanner;

public class p05_Fox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //top part
        int stars = 1;
        int dashes = 2 * n + 3 - 2 * stars - 2;
        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr("*", stars));
            System.out.print("\\");
            System.out.print(repeatStr("-", dashes));
            System.out.print("/");
            System.out.println(repeatStr("*", stars));

            stars++;
            dashes -= 2;
        }

        //middle part
        int middle = n;
        for (int i = 0; i < n / 3; i++) {
            System.out.print("|");
            System.out.print(repeatStr("*", n / 2 + i));
            System.out.print("\\");
            System.out.print(repeatStr("*", middle));
            System.out.print("/");
            System.out.print(repeatStr("*", n / 2 + i));
            System.out.println("|");

            middle -= 2;
        }

        //bottom part
        dashes = 1;
        stars = 2 * n + 3 - 2 * dashes - 2;
        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr("-", dashes));
            System.out.print("\\");
            System.out.print(repeatStr("*", stars));
            System.out.print("/");
            System.out.println(repeatStr("-", dashes));

            stars -= 2;
            dashes++;
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
