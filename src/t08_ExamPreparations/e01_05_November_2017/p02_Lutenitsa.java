package t08_ExamPreparations.e01_05_November_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p02_Lutenitsa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tomatoQuantity = Double.parseDouble(scan.nextLine());
        double count = Double.parseDouble(scan.nextLine());
        double countJars = Double.parseDouble(scan.nextLine());

        DecimalFormat df = new DecimalFormat("#.##################");

        double lutenica = tomatoQuantity / 5;
        double jars = lutenica / 0.535;
        double boxes = jars / countJars;

        System.out.printf("Total lutenica: %d kilograms.%n", (int)lutenica);
        if(boxes <= count) {
            double boxesNeeded = Math.floor(count - boxes);
            double jarsNeeded = (Math.floor(count * countJars) - jars);
            System.out.printf("%d more boxes needed.%n", (int)boxesNeeded);
            System.out.printf("%d more jars needed.", (int)jarsNeeded);
        } else {
            double boxesLeft = Math.floor(boxes - count);
            double jarsLeft = Math.floor(jars - (count * countJars));
            System.out.printf("%d boxes left.%n", (int)boxesLeft);
            System.out.printf("%d jars left.", (int)jarsLeft);
        }
    }
}
