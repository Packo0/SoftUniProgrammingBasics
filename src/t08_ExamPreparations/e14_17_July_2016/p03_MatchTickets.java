package t08_ExamPreparations.e14_17_July_2016;

import java.util.Scanner;

public class p03_MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine();
        int people = Integer.parseInt(scan.nextLine());

        double left = 0;
        if (1 <= people && people <= 4) {
            left = budget - .75 * budget;
        } else if (5 <= people && people <= 9) {
            left = budget - .60 * budget;
        } else if (10 <= people && people <= 24) {
            left = budget - .50 * budget;
        } else if (25 <= people && people <= 49) {
            left = budget - .40 * budget;
        } else {
            left = budget - .25 * budget;
        }
        double tickets = 0;
        if (category.equals("Normal")) {
            tickets = 249.99 * people;
        } else {
            tickets = 499.99 * people;
        }

        if (left > tickets) {
            System.out.printf("Yes! You have %.2f leva left.", left - tickets);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", tickets - left);
        }
    }
}
