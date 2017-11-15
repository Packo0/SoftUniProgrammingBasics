package t06_DrawingsWithLoops;

import java.util.Scanner;

public class p06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print(repeatString(" ", n - i - 1));
            System.out.println(repeatString("* ", i + 1));
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print(repeatString(" ", i + 1));
            System.out.println(repeatString("* ", n - i - 1));
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
