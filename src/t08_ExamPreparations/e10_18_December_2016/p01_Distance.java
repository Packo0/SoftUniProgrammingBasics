package t08_ExamPreparations.e10_18_December_2016;

import java.util.Scanner;

public class p01_Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double velocity = Double.parseDouble(scan.nextLine());
        int time1 = Integer.parseInt(scan.nextLine());
        int time2 = Integer.parseInt(scan.nextLine());
        int time3 = Integer.parseInt(scan.nextLine());

        double hours1 = time1 / 60.0;
        double hours2 = time2 / 60.0;
        double hours3 = time3 / 60.0;

        double distance1 = velocity * hours1;
        velocity += 0.1 * velocity;
        double distance2 = velocity * hours2;
        velocity -= 0.05* velocity;
        double distance3 = velocity * hours3;
        double total = distance1 + distance2 + distance3;

        System.out.printf("%.2f", total);
    }
}
