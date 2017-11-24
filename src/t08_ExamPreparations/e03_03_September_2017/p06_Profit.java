package t08_ExamPreparations.e03_03_September_2017;

import java.util.Scanner;

public class p06_Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num5 = Integer.parseInt(scan.nextLine());
        int amount = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= num1; i++) {
            for (int j = 0; j <= num2; j++) {
                for (int k = 0; k <= num5; k++) {
                    if((i * 1 + j * 2 + k * 5) == amount) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i,j,k,amount);
                    }
                }
            }
        }
    }
}
