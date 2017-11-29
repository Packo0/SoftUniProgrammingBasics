package t08_ExamPreparations.e12_20_November_2016_Morning;

import java.util.Scanner;

public class p06_Battles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstPlayer = Integer.parseInt(scan.nextLine());
        int secondPlayer = Integer.parseInt(scan.nextLine());
        int maxBattles = Integer.parseInt(scan.nextLine());

        int count = 0;
        for (int i = 1; i <= firstPlayer; i++) {
            for (int j = 1; j <= secondPlayer ; j++) {
                count++;
                System.out.printf("(%d <-> %d) ", i, j);
                if(count == maxBattles) {
                 return;
                }
            }
        }
    }
}
