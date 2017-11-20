package t06_DrawingsWithLoops;

import java.util.Scanner;

public class p09_House {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int asterisk, dash;
        if (n % 2 == 0) {
            asterisk = 2;
        } else {
            asterisk = 1;
        }

        dash = n - asterisk;


        if (n == 2) {
            System.out.println("**");
            System.out.println("||");
            return;
        }
        //roof
        for (int i = 1; i <= (n + 1) / 2; i++) {
            System.out.print(repeatString("-", dash / 2));
            System.out.print(repeatString("*", asterisk));
            System.out.println(repeatString("-", dash / 2));

            asterisk += 2;
            dash -= 2;
        }

        //bottom part
        for (int i = 1; i <= n  / 2; i++) {
            System.out.print("|");
            System.out.print(repeatString("*", n - 2));
            System.out.println("|");
        }
    }

    private static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
