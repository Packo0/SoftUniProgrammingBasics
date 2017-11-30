package t08_ExamPreparations.e08_19_March_2017_Morning;

import java.util.Scanner;

public class p02_Cups {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCups = Integer.parseInt(scan.nextLine());
        int numberOfWorkers = Integer.parseInt(scan.nextLine());
        int workingDays = Integer.parseInt(scan.nextLine());

        int hours = 8 * numberOfWorkers * workingDays;
        double cups = hours / 5;

        double difference = Math.abs(cups - numberOfCups);
        if (cups < numberOfCups) {
            System.out.printf("Losses: %.2f", difference * 4.2);
        } else {
            System.out.printf("%.2f extra money", difference * 4.2);
        }
    }
}
