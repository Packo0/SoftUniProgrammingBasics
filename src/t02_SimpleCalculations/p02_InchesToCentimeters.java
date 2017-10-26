package t02_SimpleCalculations;

import java.util.Scanner;

public class p02_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inches = Double.parseDouble(scan.nextLine());
        double centimeters = inches * 2.54;
        System.out.println(centimeters);
    }
}
