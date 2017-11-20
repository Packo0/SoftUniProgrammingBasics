package t06_DrawingsWithLoops;

import java.util.Scanner;

public class p12_Butterfly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int stars = n  - 2;

        for (int i = 0; i < n - 2; i++) {
            if(i % 2 == 0) {
                System.out.print(repeatString("*", stars));
            } else {
                System.out.print(repeatString("-", stars));
            }

            System.out.print("\\ /");

            if(i % 2 == 0) {
                System.out.println(repeatString("*", stars));
            } else {
                System.out.println(repeatString("-", stars));
            }
        }

        System.out.print(repeatString(" ", n -1));
        System.out.println("@");

        for (int i = 0; i < n - 2; i++) {
            if(i % 2 == 0) {
                System.out.print(repeatString("*", stars));
            } else {
                System.out.print(repeatString("-", stars));
            }

            System.out.print("/ \\");

            if(i % 2 == 0) {
                System.out.println(repeatString("*", stars));
            } else {
                System.out.println(repeatString("-", stars));
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
