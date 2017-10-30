package t04_ComplexConditionalStatements;

import java.util.Scanner;

public class p12_Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yearType = scan.nextLine();
        int holidays = Integer.parseInt(scan.nextLine());
        int weekends = Integer.parseInt(scan.nextLine());

        int weekendsInSofia = 48 - weekends;

        double weekendsNotWork = weekendsInSofia * 3 / 4.0;
        double totalGames = weekendsNotWork + weekends + holidays * 2 / 3.0;

        if(yearType.equals("leap")) {
            totalGames = totalGames * 0.15 + totalGames;
        }

        System.out.printf("%.0f", Math.floor(totalGames));

    }
}
