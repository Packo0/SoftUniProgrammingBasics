package t08_ExamPreparations.e03_03_September_2017;

import java.util.Scanner;

public class p05_Snowflake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //first part

        for (int i = 0; i < n; i++) {
            if(i == n - 1) {
                System.out.print(repeatString(".", i));
                System.out.print("*****");
                System.out.println(repeatString(".", i));
                break;
            }

            System.out.print(repeatString(".", i));
            System.out.print("*");
            System.out.print(repeatString(".", n-i));
            System.out.print("*");
            System.out.print(repeatString(".", n-i));
            System.out.print("*");
            System.out.println(repeatString(".", i));
        }

        //middle part
        System.out.println(repeatString("*", 2 * n + 3));

        //down
        for (int i = n-1; i >= 0; i--) {
            if(i == n-1) {
                System.out.print(repeatString(".", i));
                System.out.print("*****");
                System.out.println(repeatString(".", i));
                continue;
            }

            System.out.print(repeatString(".", i));
            System.out.print("*");
            System.out.print(repeatString(".", n-i));
            System.out.print("*");
            System.out.print(repeatString(".", n-i));
            System.out.print("*");
            System.out.println(repeatString(".", i));
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
