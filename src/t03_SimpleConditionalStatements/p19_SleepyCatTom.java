package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p19_SleepyCatTom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vacantDays = Integer.parseInt(scan.nextLine());

        int workDays = 365 - vacantDays;

        int playTime = workDays * 63 + vacantDays * 127;

        int norm = Math.abs(30000 - playTime);

        int hours = Math.abs(norm / 60);
        int minutes = Math.abs(norm % 60);

        if (30000 > playTime) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }

    }
}
