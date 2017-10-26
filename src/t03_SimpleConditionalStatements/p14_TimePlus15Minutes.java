package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p14_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hh = Integer.parseInt(scan.nextLine());
        int mm = Integer.parseInt(scan.nextLine());

        mm += 15;

        if (mm > 59) {
            hh += 1;
            mm -= 60;
        }

        if (hh > 23) {
            hh = 0;
        }

        System.out.printf("%d:%02d", hh, mm);
    }
}
