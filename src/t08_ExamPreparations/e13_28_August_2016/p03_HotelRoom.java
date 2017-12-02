package t08_ExamPreparations.e13_28_August_2016;

import java.util.Scanner;

public class p03_HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;
        if(month.equals("May") || month.equals("October")) {
            studioPrice = 50 * days;
            apartmentPrice = 65 * days;

            if(days > 14){
                studioPrice -= studioPrice*0.3;
                apartmentPrice -= apartmentPrice * 0.1;
            } else if(days > 7) {
                studioPrice -= studioPrice * 0.05;
            }
        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20 * days;
            apartmentPrice = 68.70 * days;

            if(days > 14){
                studioPrice -= studioPrice*0.2;
                apartmentPrice -= apartmentPrice * 0.1;
            }
        } else {
            studioPrice = 76 * days;
            apartmentPrice = 77 * days;

            if(days > 14){
                apartmentPrice -= apartmentPrice * 0.1;
            }
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
