package t08_ExamPreparations.e09_18_March_2017;

import java.util.Scanner;

public class p04_GameOFIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int moves = Integer.parseInt(scan.nextLine());

        int interval1 = 0;
        int interval2 = 0;
        int interval3 = 0;
        int interval4 = 0;
        int interval5 = 0;
        int interval6 = 0;
        double score = 0;
        for (int i = 0; i < moves; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            if(currentNumber < 0){
                interval6++;
                score /= 2;
                continue;
            }

            if (currentNumber <= 9) {
                interval1++;
                score += currentNumber * 0.2;
            } else if (currentNumber <= 19) {
                interval2++;
                score += currentNumber * 0.3;
            } else if (currentNumber <= 29) {
                interval3++;
                score += currentNumber * 0.4;
            } else if (currentNumber <= 39) {
                interval4++;
                score += 50;
            } else if (currentNumber <= 50) {
                interval5++;
                score += 100;
            }

        }

        System.out.printf("%.2f%n", score);
        System.out.printf("From 0 to 9: %.2f%%%n", interval1 / (double) moves * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", interval2 / (double) moves * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", interval3 / (double) moves * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", interval4 / (double) moves * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", interval5 / (double) moves * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", interval6 / (double) moves * 100);

    }
}
