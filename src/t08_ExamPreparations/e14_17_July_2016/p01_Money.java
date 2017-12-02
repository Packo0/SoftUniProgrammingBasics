package t08_ExamPreparations.e14_17_July_2016;

import java.util.Scanner;

public class p01_Money {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bitcoins = Double.parseDouble(scan.nextLine());
        double chinese = Double.parseDouble(scan.nextLine());
        double comission = Double.parseDouble(scan.nextLine());

        double levaBitcoins = bitcoins * 1168;
        double dollarsChinese = chinese * 0.15;
        double levaChinese = dollarsChinese * 1.76;
        double total = (levaBitcoins + levaChinese) / 1.95;
        total -= total * (comission / 100.0);

        System.out.printf("%.2f", total);
    }
}
