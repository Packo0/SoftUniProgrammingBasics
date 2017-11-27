package t08_ExamPreparations.e05_25_June_2017;

import java.util.Scanner;

public class p02_SwimRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double recordTime = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double timeForMeter = Double.parseDouble(scan.nextLine());

        double timeForSwim = distance * timeForMeter;

        int test = (int)(distance / 15.0);
        double delay = test * 12.5;
        double totalTime = timeForSwim + delay;

        if (recordTime <= totalTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordTime);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
