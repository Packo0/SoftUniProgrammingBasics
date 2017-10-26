package t02_SimpleCalculations;

import java.util.Scanner;

public class p16_DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double A = Double.parseDouble(scan.nextLine());

        double hallArea =  length * width * 10000;
        double wardrobeArea = A * A * 10000;
        double benchArea = hallArea / 10.0;

        double freeSpace = hallArea - wardrobeArea - benchArea;

        double numberOfDancers = freeSpace / (40 + 7000);

        System.out.printf("%.0f", Math.floor(numberOfDancers));


    }
}
