package t08_ExamPreparations.e02_17_September_2017;

import java.util.Scanner;

public class p02_ThreeBrothers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double time1 = Double.parseDouble(scan.nextLine());
        double time2 = Double.parseDouble(scan.nextLine());
        double time3 = Double.parseDouble(scan.nextLine());
        double timeFather = Double.parseDouble(scan.nextLine());

        double totalCleanTime = 1 / (1 / time1 + 1 / time2 + 1 / time3);
        double restTime = totalCleanTime + totalCleanTime * 0.15;

        double hoursDifference = timeFather - restTime;
        System.out.printf("Cleaning time: %.2f%n", restTime);
        if (hoursDifference > 0) {
            System.out.printf("Yes, there is a surprise - time left -> %d hours.", (int)hoursDifference);
        } else {
            hoursDifference *= -1;
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(hoursDifference));
        }
    }
}
