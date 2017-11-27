package t08_ExamPreparations.e07_19_March_2017_Evening;

import java.util.Scanner;

public class p02_Styrofoam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double area = Double.parseDouble(scan.nextLine());
        int window = Integer.parseInt(scan.nextLine());
        double styrofoam = Double.parseDouble(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());

        double houseArea = area - window * 2.4;
        houseArea = houseArea + 0.1 * houseArea;
        double packets = Math.ceil(houseArea / styrofoam);
        double spent = packets * price;
        if (spent < budget) {
            System.out.printf("Spent: %.2f%n", spent);
            System.out.printf("Left: %.2f",budget - spent);
        } else {
            System.out.printf("Need more: %.2f", spent - budget);
        }
    }
}
