package t08_ExamPreparations.e04_23_July_2017;

import java.util.Scanner;

public class p04_EnergyLoss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int dancers = Integer.parseInt(scan.nextLine());

        int allPower = days * dancers * 100;
        int savedPower = 0;
        for (int i = 1; i <= days; i++) {
            int hours = Integer.parseInt(scan.nextLine());
            int currentPower = 0;
            if (i % 2 != 0 && hours % 2 != 0) {
                currentPower = dancers * 30;
            } else if (i % 2 == 0 && hours % 2 == 0) {
                currentPower = dancers * 68;
            } else if (i % 2 != 0 && hours % 2 == 0) {
                currentPower = dancers * 49;
            } else if (i % 2 == 0 && hours % 2 != 0) {
                currentPower = dancers * 65;
            }

            savedPower += currentPower;
        }
        int temp = allPower - savedPower;
        double result = (double) temp / days / dancers;

        if (result > 50) {
            System.out.printf("They feel good! Energy left: %.2f", result);
        } else {
            System.out.printf("They are wasted! Energy left: %.2f", result);
        }

    }
}
