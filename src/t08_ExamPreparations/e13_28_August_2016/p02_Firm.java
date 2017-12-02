package t08_ExamPreparations.e13_28_August_2016;

import java.util.Scanner;

public class p02_Firm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int employees = Integer.parseInt(scan.nextLine());

        double workingHours = (days - days * 0.1) * 8;
        double overTime = employees * 2 * days;
        int totalHours = (int)(workingHours + overTime);

        if(totalHours >= hours) {
            System.out.printf("Yes!%d hours left.", totalHours - hours);
        } else {
            System.out.printf("Not enough time!%d hours needed.", hours - totalHours);
        }
    }
}
