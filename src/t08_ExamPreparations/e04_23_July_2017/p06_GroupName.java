package t08_ExamPreparations.e04_23_July_2017;

import java.util.Scanner;

public class p06_GroupName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);
        char third = scan.nextLine().charAt(0);
        char forth = scan.nextLine().charAt(0);
        int num = Integer.parseInt(scan.nextLine());

        int count = 0;

        for (char i = 'A'; i <= first; i++) {
            for (char j = 'a'; j <= second; j++) {
                for (char k = 'a'; k <= third; k++) {
                    for (char l = 'a'; l <= forth; l++) {
                        for (int m = 0; m <= num; m++) {
                            count++;
                        }
                    }
                }
            }
        }



        System.out.println(count-1);
    }
}
