package t08_ExamPreparations.e15_24_April_2016;

import java.util.Scanner;

public class p02_TomTheCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int holidays = Integer.parseInt(scan.nextLine());

        int workingDays = 365 - holidays;

        int totalPlayMinutes = holidays * 127 + workingDays * 63;


        if(30000 >= totalPlayMinutes) {
            int left = 30000 - totalPlayMinutes;
            int hours = left / 60;
            int minutes = left % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        } else {
            int left = totalPlayMinutes - 30000;
            int hours = left / 60;
            int minutes = left % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }

    }
}
