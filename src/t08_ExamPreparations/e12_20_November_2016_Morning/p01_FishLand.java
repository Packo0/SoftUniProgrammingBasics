package t08_ExamPreparations.e12_20_November_2016_Morning;

import java.util.Scanner;

public class p01_FishLand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double skumriqPrice = Double.parseDouble(scan.nextLine());
        double cacaPrice = Double.parseDouble(scan.nextLine());
        double palamudKg = Double.parseDouble(scan.nextLine());
        double safridKg = Double.parseDouble(scan.nextLine());
        int midiKg = Integer.parseInt(scan.nextLine());

        double palamudPrice = skumriqPrice + 0.6 * skumriqPrice;
        double safridPrice = cacaPrice + 0.8 * cacaPrice;

        double palamudCost = palamudKg * palamudPrice;
        double safridCost = safridPrice * safridKg;
        double midiCost = 7.50 * midiKg;

        System.out.printf("%.2f", palamudCost + safridCost + midiCost);


    }
}
