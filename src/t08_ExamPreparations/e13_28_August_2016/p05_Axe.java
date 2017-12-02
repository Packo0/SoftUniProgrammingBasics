package t08_ExamPreparations.e13_28_August_2016;

import java.util.Scanner;

public class p05_Axe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int width = 5 * n;

        //up
        int middle = 0;
        int right = width - 3 * n - middle - 2;
        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr("-", 3 * n));
            System.out.print("*");
            System.out.print(repeatStr("-", middle));
            System.out.print("*");
            System.out.println(repeatStr("-", right));

            middle++;
            right--;
        }

        //middle
        middle--;
        right++;
        for (int i = 0; i < n / 2; i++) {
            System.out.print(repeatStr("*", 3 * n));
            System.out.print("*");
            System.out.print(repeatStr("-", middle));
            System.out.print("*");
            System.out.println(repeatStr("-", right));
        }

        //down
        for (int i = 0; i < n / 2; i++) {
            System.out.print(repeatStr("-", 3 * n - i));
            System.out.print("*");
            if(i == n / 2 - 1) {
                System.out.print(repeatStr("*", middle));
            } else {
                System.out.print(repeatStr("-", middle));
            }

            System.out.print("*");
            System.out.println(repeatStr("-", right));

            middle += 2;
            right--;
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
