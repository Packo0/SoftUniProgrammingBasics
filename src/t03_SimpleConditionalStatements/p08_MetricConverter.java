package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p08_MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double distance = Double.parseDouble(scan.nextLine());
        String inputUnit = scan.nextLine();
        String outputUnit = scan.nextLine();

        double mm = 1000;
        double cm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;

        if (inputUnit.equals("mm")) {
            distance = distance / mm;
        } else if (inputUnit.equals("cm")) {
            distance = distance / cm;
        } else if (inputUnit.equals("mi")) {
            distance = distance / mi;
        } else if (inputUnit.equals("in")) {
            distance = distance / in;
        } else if (inputUnit.equals("km")) {
            distance = distance / km;
        } else if (inputUnit.equals("ft")) {
            distance = distance / ft;
        } else if (inputUnit.equals("yd")) {
            distance = distance / yd;
        }

        if (outputUnit.equals("mm")) {
            distance = distance * mm;
        } else if (outputUnit.equals("cm")) {
            distance = distance * cm;
        } else if (outputUnit.equals("mi")) {
            distance = distance * mi;
        } else if (outputUnit.equals("in")) {
            distance = distance * in;
        } else if (outputUnit.equals("km")) {
            distance = distance * km;
        } else if (outputUnit.equals("ft")) {
            distance = distance * ft;
        } else if (outputUnit.equals("yd")) {
            distance = distance * yd;
        }

        System.out.printf("%f", distance);
    }
}
