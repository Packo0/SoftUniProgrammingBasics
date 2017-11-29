package t08_ExamPreparations.e11_20_November_2017_Evening;

import java.util.Scanner;

public class p01_HousePrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double littleRoomArea = Double.parseDouble(scan.nextLine());
        double kitchenArea = Double.parseDouble(scan.nextLine());
        double pricePerMeter = Double.parseDouble(scan.nextLine());

        double bathRoomArea = littleRoomArea / 2;
        double middleRoomArea = littleRoomArea + littleRoomArea * 0.1;
        double largestArea = middleRoomArea + middleRoomArea * 0.1;

        double totalArea = littleRoomArea + middleRoomArea + largestArea + bathRoomArea + kitchenArea;
        totalArea += totalArea * 0.05;

        System.out.printf("%.2f", totalArea * pricePerMeter);
    }
}
