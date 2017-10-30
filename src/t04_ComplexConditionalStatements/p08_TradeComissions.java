package t04_ComplexConditionalStatements;

import java.util.Scanner;

public class p08_TradeComissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double comission = -1;

        if (town.equals("Sofia")) {
            if (0 <= sales && sales <= 500) {
                comission = 0.05;
            } else if (500 < sales && sales <= 1000) {
                comission = 0.07;
            } else if (1000 < sales && sales <= 10000) {
                comission = 0.08;
            } else if (sales > 1000) {
                comission = 0.12;
            }
        } else if (town.equals("Varna")) {
            if (0 <= sales && sales <= 500) {
                comission = 0.045;
            } else if (500 < sales && sales <= 1000) {
                comission = 0.075;
            } else if (1000 < sales && sales <= 10000) {
                comission = 0.10;
            } else if (sales > 1000) {
                comission = 0.13;
            }
        } else if (town.equals("Plovdiv")) {
            if (0 <= sales && sales <= 500) {
                comission = 0.055;
            } else if (500 < sales && sales <= 1000) {
                comission = 0.08;
            } else if (1000 < sales && sales <= 10000) {
                comission = 0.12;
            } else if (sales > 1000) {
                comission = 0.145;
            }
        }

        if (comission > 0) {
            System.out.printf("%.2f", sales * comission);
        } else {
            System.out.println("error");
        }
    }
}
