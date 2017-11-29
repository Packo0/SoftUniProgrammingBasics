package t08_ExamPreparations.e11_20_November_2017_Evening;

import java.util.Scanner;

public class p03_BikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int juniorBikers = Integer.parseInt(scan.nextLine());
        int seniorBikers = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();

        double tax = 0;
        if(type.equals("trail")) {
            tax = juniorBikers * 5.50 + seniorBikers * 7;
        } else if (type.equals("cross-country")) {
            tax = juniorBikers * 8 + seniorBikers * 9.5;
        } else if (type.equals("downhill")) {
            tax = juniorBikers * 12.25 + seniorBikers * 13.75;
        } else if (type.equals("road")) {
            tax = juniorBikers * 20 + seniorBikers * 21.50;
        }

        if(type.equals("cross-country") && (juniorBikers + seniorBikers) >= 50) {
            tax -= tax * 0.25;
        }

        tax -= tax*0.05;

        System.out.printf("%.2f", tax);
    }
}
