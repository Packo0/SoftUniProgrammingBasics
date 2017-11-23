package t08_ExamPreparations.e01_05_November_2017;

import java.util.Scanner;

public class p06_LuckyNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int d1 = 1; d1 <= 9; d1++) {
            for (int d2 = 1; d2 <= 9; d2++) {
                for (int d3 = 1; d3 <= 9; d3++) {
                    for (int d4 = 1; d4 <= 9; d4++) {
                        if(d1 + d2 == d3 + d4) {
                            if( n % (d1 + d2) == 0) {
                                System.out.printf("%d%d%d%d ", d1, d2, d3, d4);
                            }
                        }
                    }
                }
            }
        }
    }
}
