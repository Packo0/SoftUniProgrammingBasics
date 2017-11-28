package t08_ExamPreparations.e11_20_November_2017_Morning;

import java.util.Scanner;

public class p03_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int adults = Integer.parseInt(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        String transportType = scan.nextLine();

        double transportCost = 0;
        double hotelCost = 0;
        double commision = 0;
        double sum = 0;
        if(transportType.equals("train")) {
            transportCost = (adults * 24.99 + students * 14.99) * 2;
            if(adults + students > 50) {
                transportCost -= transportCost * 0.5;
            }

            hotelCost = nights * 82.99;
            commision = (transportCost + hotelCost) * 0.1;
            sum = transportCost + hotelCost + commision;

        } else if (transportType.equals("bus")) {
            transportCost = (adults * 32.50 + students * 28.50) * 2;
            hotelCost = nights * 82.99;
            commision = (transportCost + hotelCost) * 0.1;
            sum = transportCost + hotelCost + commision;
        } else if (transportType.equals("boat")) {
            transportCost = (adults * 42.99 + students * 39.99) * 2;
            hotelCost = nights * 82.99;
            commision = (transportCost + hotelCost) * 0.1;
            sum = transportCost + hotelCost + commision;
        } else if (transportType.equals("airplane")) {
            transportCost = (adults * 70 + students * 50) * 2;
            hotelCost = nights * 82.99;
            commision = (transportCost + hotelCost) * 0.1;
            sum = transportCost + hotelCost + commision;
        }

        System.out.printf("%.2f", sum);
    }
}
