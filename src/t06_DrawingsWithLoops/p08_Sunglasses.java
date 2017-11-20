package t06_DrawingsWithLoops;

import java.util.Scanner;

public class p08_Sunglasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //first row
        System.out.print(repeatString("*", 2 * n));
        System.out.print(repeatString(" ", n));
        System.out.println(repeatString("*", 2 * n));

        //middle part
        for (int i = 0; i < n - 2; i++) {
            //left part
            System.out.print("*");
            System.out.print(repeatString("/", 2 * n - 2));
            System.out.print("*");

            //middle part
            if(i == (n-1) / 2 - 1) {
                System.out.print(repeatString("|", n));
            } else {
                System.out.print(repeatString(" ", n));
            }


            //right part
            System.out.print("*");
            System.out.print(repeatString("/", 2 * n - 2));
            System.out.println("*");
        }
        //last row
        System.out.print(repeatString("*", 2 * n));
        System.out.print(repeatString(" ", n));
        System.out.println(repeatString("*", 2 * n));
    }

    private static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
