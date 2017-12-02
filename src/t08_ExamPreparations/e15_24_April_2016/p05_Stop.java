package t08_ExamPreparations.e15_24_April_2016;

import java.util.Scanner;

public class p05_Stop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int width = 4 * n + 3;

        int dots = n + 1;
        int dashes = 2 * n + 1;

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.print(repeatStr(".", dots));
                System.out.print(repeatStr("_", dashes));
                System.out.println(repeatStr(".", dots));
                dashes -= 4;
            } else {
                System.out.print(repeatStr(".", dots));
                System.out.print("//");
                System.out.print(repeatStr("_", dashes));
                System.out.print("\\\\");
                System.out.println(repeatStr(".", dots));
            }

            dots--;
            dashes += 2;
        }

        //middle row
        System.out.print("//");
        System.out.print(repeatStr("_", (width - 8) / 2));
        System.out.print("STOP!");
        System.out.print(repeatStr("_", (width - 8) / 2));
        System.out.println("\\\\");

        //down
        dots = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr(".", dots));
            System.out.print("\\\\");
            System.out.print(repeatStr("_", dashes));
            System.out.print("//");
            System.out.println(repeatStr(".", dots));


            dots++;
            dashes -= 2;
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
