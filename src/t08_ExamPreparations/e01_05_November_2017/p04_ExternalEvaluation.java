package t08_ExamPreparations.e01_05_November_2017;

import java.util.Scanner;

public class p04_ExternalEvaluation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int students = Integer.parseInt(scan.nextLine());
        int poor = 0, satisfactory = 0, good = 0, veryGood = 0, excellent = 0;
        for (int i = 0; i < students; i++) {
            double mark = Double.parseDouble(scan.nextLine());
            if(mark < 22.5) {
                poor++;
            } else if (mark < 40.5) {
                satisfactory++;
            } else if (mark < 58.5) {
                good++;
            } else if (mark  < 76.5) {
                veryGood++;
            } else if (mark <= 100) {
                excellent++;
            }
        }

        System.out.printf("%.2f%% poor marks%n", poor / (double)students * 100.0);
        System.out.printf("%.2f%% satisfactory marks%n", satisfactory / (double)students * 100.0);
        System.out.printf("%.2f%% good marks%n", good / (double)students * 100.0);
        System.out.printf("%.2f%% very good marks%n", veryGood / (double)students * 100.0);
        System.out.printf("%.2f%% excellent marks", excellent / (double)students * 100.0);
    }
}
