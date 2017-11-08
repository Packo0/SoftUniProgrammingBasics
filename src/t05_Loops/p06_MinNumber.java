package t05_Loops;

import java.util.Scanner;

public class p06_MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        int min = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < num - 1; i++) {
            int nextNumber = Integer.parseInt(scan.nextLine());
            if(nextNumber < min) {
                min = nextNumber;
            }
        }

        System.out.println(min);
    }
}
