package t08_ExamPreparations.e06_7_May_2017;

import java.util.Scanner;

public class p04_FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scan.nextLine());
        int fenNumber = Integer.parseInt(scan.nextLine());

        double fenA = 0;
        double fenB = 0;
        double fenV = 0;
        double fenG = 0;
        for (int i = 0; i < fenNumber; i++) {
            String sector = scan.nextLine();

            if (sector.equals("A")) {
                fenA++;
            } else if (sector.equals("B")) {
                fenB++;
            } else if (sector.equals("V")) {
                fenV++;
            } else if (sector.equals("G")) {
                fenG++;
            }
        }

        System.out.printf("%.2f%%%n", fenA / fenNumber *100);
        System.out.printf("%.2f%%%n", fenB / fenNumber *100);
        System.out.printf("%.2f%%%n", fenV / fenNumber *100);
        System.out.printf("%.2f%%%n", fenG / fenNumber *100);
        System.out.printf("%.2f%%%n", (double)fenNumber / stadiumCapacity *100);
    }
}
