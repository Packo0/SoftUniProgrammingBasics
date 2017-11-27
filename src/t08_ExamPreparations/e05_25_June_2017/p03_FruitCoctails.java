package t08_ExamPreparations.e05_25_June_2017;

import java.util.Scanner;

public class p03_FruitCoctails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String size = scan.nextLine();
        int drinksNum = Integer.parseInt(scan.nextLine());

        double prize = 0;
        if (size.equals("small")) {
            switch (fruit) {
                case "Watermelon":
                    prize = 2 * drinksNum * 56;
                    break;
                case "Mango":
                    prize = 2 * drinksNum * 36.66;
                    break;
                case "Pineapple":
                    prize = 2 * drinksNum * 42.10;
                    break;
                case "Raspberry":
                    prize = 2 * drinksNum * 20;
                    break;
            }
        } else if (size.equals("big")) {
            switch (fruit) {
                case "Watermelon":
                    prize = 5 * drinksNum * 28.70;
                    break;
                case "Mango":
                    prize = 5 * drinksNum * 19.60;
                    break;
                case "Pineapple":
                    prize = 5 * drinksNum * 24.80;
                    break;
                case "Raspberry":
                    prize = 5 * drinksNum * 15.20;
                    break;
            }
        }

        if (prize > 1000) {
            prize = prize - 0.5 * prize;
        } else if (400 <= prize && prize <= 1000) {
            prize = prize - 0.15 * prize;
        }

        System.out.printf("%.2f lv.", prize);

    }
}
