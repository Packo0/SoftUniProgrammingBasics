package t04_ComplexConditionalStatements;

import java.util.Scanner;

public class p17_MatchTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine();
        int peopleCount = Integer.parseInt(scan.nextLine());

        double moneyForTransport = -1;

        if(peopleCount <= 4){
            moneyForTransport = money * 0.75;
        } else if (peopleCount <= 9) {
            moneyForTransport = money * 0.60;
        } else if (peopleCount <= 24) {
            moneyForTransport = money * 0.50;
        } else if (peopleCount <= 49) {
            moneyForTransport = money * 0.40;
        } else {
            moneyForTransport = money * 0.25;
        }

        double moneyForTickets = money - moneyForTransport;
        if(category.equals("VIP")) {
            if (peopleCount * 499.99 < moneyForTickets) {
                System.out.printf("Yes! You have %.2f leva left.", moneyForTickets - peopleCount * 499.99);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", peopleCount * 499.99 - moneyForTickets);
            }
        } else {
            if (peopleCount * 249.99 < moneyForTickets) {
                System.out.printf("Yes! You have %.2f leva left.", moneyForTickets - peopleCount * 249.99);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", peopleCount * 249.99 - moneyForTickets);
            }

        }
    }
}
