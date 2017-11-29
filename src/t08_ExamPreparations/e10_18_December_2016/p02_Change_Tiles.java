package t08_ExamPreparations.e10_18_December_2016;

import java.util.Scanner;

public class p02_Change_Tiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double savedMoney = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double side = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        double maistor = Double.parseDouble(scan.nextLine());

        double floorArea = width * length;
        double triangleArea = side * height / 2;

        double numberOfTiles = Math.ceil(floorArea / triangleArea) + 5;

        double sum = numberOfTiles * price + maistor;

        if(sum <= savedMoney) {
            System.out.printf("%.2f lv left.", savedMoney - sum);
        } else {
            System.out.printf("You'll need %.2f lv more.", sum - savedMoney);
        }
    }
}
