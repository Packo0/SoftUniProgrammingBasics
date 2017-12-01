package t08_ExamPreparations.e09_18_March_2017;

import java.util.Scanner;

public class p02_WorkHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        int workDays = Integer.parseInt(scan.nextLine());

        int totalHours =  workDays * workers * 8;

        if(totalHours > hours) {
            System.out.printf("%d hours left", totalHours - hours);
        } else {
            System.out.printf("%d overtime%nPenalties: %d", hours - totalHours, (hours - totalHours) * workDays);
        }
    }
}
