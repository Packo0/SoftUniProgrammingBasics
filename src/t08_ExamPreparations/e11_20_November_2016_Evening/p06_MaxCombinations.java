package t08_ExamPreparations.e11_20_November_2016_Evening;

import java.util.Scanner;

public class p06_MaxCombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int begin = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int max = Integer.parseInt(scan.nextLine());

        int count = 0;
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                count++;
                System.out.printf("<%d-%d>", i, j);
                if(count == max) {
                    return;
                }
            }
        }
    }
}
