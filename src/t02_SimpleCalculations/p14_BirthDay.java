package t02_SimpleCalculations;

import java.util.Scanner;

public class p14_BirthDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double procent = Double.parseDouble(scan.nextLine());

        double volumeInCm3 = length * width * height;

        double volumeInLitres = volumeInCm3 * 0.001;

        double result = volumeInLitres * (1 - procent * 0.01);
        System.out.printf("%.3f", result);


    }
}
