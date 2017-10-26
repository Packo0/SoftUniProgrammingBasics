package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p07_SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secondsPlayerOne = Integer.parseInt(scan.nextLine());
        int secondsPlayerTwo = Integer.parseInt(scan.nextLine());
        int secondsPlayerThree = Integer.parseInt(scan.nextLine());

        int totalSeconds = secondsPlayerOne + secondsPlayerTwo + secondsPlayerThree;

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d:%02d", minutes, seconds);

    }
}
