package t06_DrawingsWithLoops;

import java.util.Scanner;

public class p05_SquareFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                System.out.print("+ ");
                System.out.print(repeatString("- ", n - 2));
                System.out.println("+");
            } else {
                System.out.print("| ");
                System.out.print(repeatString("- ", n - 2));
                System.out.println("|");
            }
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
