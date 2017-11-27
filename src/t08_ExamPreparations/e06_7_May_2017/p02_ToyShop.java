package t08_ExamPreparations.e06_7_May_2017;

import java.util.Scanner;

public class p02_ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int talkDolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double totalPrice = puzzles * 2.6 + talkDolls * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;

        int toysCount = puzzles + talkDolls + bears + minions + trucks;

        if(toysCount >= 50) {
            totalPrice = totalPrice - 0.25 * totalPrice;
        }

        double rent = 0.1 * totalPrice;

        double moneyLeft = totalPrice -rent;

        if(price > moneyLeft) {
            System.out.printf("Not enough money! %.2f lv needed.", price - moneyLeft);
        } else {
            System.out.printf("Yes! %.2f lv left.", moneyLeft - price);
        }


    }
}
