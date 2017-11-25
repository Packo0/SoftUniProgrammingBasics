package t08_ExamPreparations.e04_23_July_2017;

import java.util.Scanner;

public class p02_Choreography {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int steps = Integer.parseInt(scan.nextLine());
        int dancers = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        double stepsPerDay = Math.ceil(((double)steps / days) / steps * 100); //in percent
        double percentStep = stepsPerDay / dancers;

        if(stepsPerDay < 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", percentStep);
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", percentStep);
        }
    }
}
