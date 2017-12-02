package t08_ExamPreparations.e17_6_March_2016;

import java.util.Scanner;

public class p06_StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());

        for (int symbol1 = 1; symbol1 <= n; symbol1++) {
            for (int symbol2 = 1; symbol2 <= n; symbol2++) {
                for (char symbol3 = 'a'; symbol3 < 'a' + l; symbol3++) {
                    for (char symbol4 = 'a'; symbol4 < 'a' + l; symbol4++) {
                        for (int symbol5 = Math.max(symbol1, symbol2) + 1; symbol5 <= n; symbol5++) {
                            System.out.print(symbol1);
                            System.out.print(symbol2);
                            System.out.print(symbol3);
                            System.out.print(symbol4);
                            System.out.print(symbol5);
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
}
