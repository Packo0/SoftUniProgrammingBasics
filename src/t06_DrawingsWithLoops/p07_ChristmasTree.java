package t06_DrawingsWithLoops;

import java.util.Scanner;

public class p07_ChristmasTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= n; i++) {
            System.out.print(repeatString(" ", n - i));
            System.out.print(repeatString("*", i));
            System.out.print(" | ");
            System.out.println(repeatString("*", i));
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
