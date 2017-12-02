package t08_ExamPreparations.e17_6_March_2016;

import java.util.Scanner;

public class p03_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHour = Integer.parseInt(scan.nextLine());
        int examMinute = Integer.parseInt(scan.nextLine());
        int arriveHour = Integer.parseInt(scan.nextLine());
        int arriveMinute = Integer.parseInt(scan.nextLine());

        int exam = examHour * 60 + examMinute;
        int arrive = arriveHour * 60 + arriveMinute;

        int deltaT = exam - arrive;

        if(deltaT == 0) {
            System.out.println("On time");
        } else if (deltaT > 0) { // arrive before the start of exam
            if(deltaT <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", Math.abs(deltaT));
            } else if (deltaT <= 59) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", Math.abs(deltaT));
            } else {
                System.out.println("Early");
                System.out.printf("%d %02d hours before the start", Math.abs(deltaT / 60), Math.abs(deltaT % 60));
            }

        } else { //deltaT < 0 arrive after the start of exam
            if(Math.abs(deltaT) <= 59) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", Math.abs(deltaT));
            } else {
                System.out.println("Late");
                System.out.printf("%d %02d hours after the start", Math.abs(deltaT / 60), Math.abs(deltaT % 60));
            }
        }

    }
}
