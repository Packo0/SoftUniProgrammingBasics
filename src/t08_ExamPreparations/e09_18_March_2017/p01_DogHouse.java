package t08_ExamPreparations.e09_18_March_2017;

import java.util.Scanner;

public class p01_DogHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());

        double twoSides = 2 * a * (a / 2);
        double backWall = (a / 2) * (a / 2) + (a / 2 * (b - a / 2)) / 2;
        double door = a / 5 * a / 5;
        double frontWall = backWall - door;
        double totalArea = twoSides + backWall + frontWall;

        System.out.printf("%.2f%n", totalArea / 3);

        double roof = a * (a / 2) * 2;
        System.out.printf("%.2f", roof / 5);
    }
}
