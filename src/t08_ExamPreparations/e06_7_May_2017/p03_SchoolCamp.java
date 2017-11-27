package t08_ExamPreparations.e06_7_May_2017;

import java.util.Scanner;

public class p03_SchoolCamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        String groupType = scan.nextLine();
        int students = Integer.parseInt(scan.nextLine());
        int sleepNights = Integer.parseInt(scan.nextLine());

        double price = -1;
        if(season.equals("Winter")) {
            if(groupType.equals("boys")) {
                price = sleepNights * students * 9.6;
                System.out.print("Judo ");
            } else if (groupType.equals("girls")) {
                price = sleepNights * students * 9.6;
                System.out.print("Gymnastics ");
            } else if (groupType.equals("mixed")) {
                price = sleepNights * students * 10;
                System.out.print("Ski ");
            }
        } else if (season.equals("Spring")) {
            if(groupType.equals("boys")) {
                price = sleepNights * students * 7.2;
                System.out.print("Tennis ");
            } else if (groupType.equals("girls")) {
                price = sleepNights * students * 7.2;
                System.out.print("Athletics ");
            } else if (groupType.equals("mixed")) {
                price = sleepNights * students * 9.5;
                System.out.print("Cycling ");
            }
        } else if (season.equals("Summer")) {
            if(groupType.equals("boys")) {
                price = sleepNights * students * 15;
                System.out.print("Football ");
            } else if (groupType.equals("girls")) {
                price = sleepNights * students * 15;
                System.out.print("Volleyball ");
            } else if (groupType.equals("mixed")) {
                price = sleepNights * students * 20;
                System.out.print("Swimming ");
            }
        }

        if(students >= 50) {
            price = price - 0.5 * price;
        } else if(students >= 20) {
            price = price - 0.15 * price;
        } else if (students >= 10) {
            price = price - 0.05 * price;
        }

        System.out.printf("%.2f lv.", price);
    }
}
