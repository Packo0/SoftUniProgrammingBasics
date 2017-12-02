package t08_ExamPreparations.e16_26_March_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p02_PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = Integer.parseInt(scan.nextLine());
        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        DecimalFormat df = new DecimalFormat("#.######################");
        double fullP1 = p1 * h;
        double fullP2 = p2 * h;
        double totalFull = (fullP1 + fullP2);
        double totalFullPercent = totalFull / v * 100;
        double percentP1 = fullP1 / totalFull * 100;
        double percentP2 = fullP2 / totalFull * 100;

        if (totalFull <= v) {
            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.",
                    (int) totalFullPercent,
                    (int) percentP1,
                    (int) percentP2);

        } else {
            System.out.printf("For %s hours the pool overflows with %.1f liters.",
                    df.format(h), totalFull - v);

        }


    }
}
