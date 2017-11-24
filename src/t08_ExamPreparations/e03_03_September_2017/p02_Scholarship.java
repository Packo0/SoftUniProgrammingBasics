package t08_ExamPreparations.e03_03_September_2017;

import java.util.Scanner;

public class p02_Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double familySalary = Double.parseDouble(scan.nextLine());
        double score = Double.parseDouble(scan.nextLine());
        double minSalary = Double.parseDouble(scan.nextLine());

        if (score >= 5.5 ) {
            System.out.printf("You get a scholarship for excellent results %d BGN", (int) (25 * score));
        } else if (familySalary < minSalary && score > 4.5) {
            System.out.printf("You get a Social scholarship %d BGN", (int) (0.35 * minSalary));
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}