package t07_AdvancedLoops;

import java.util.Scanner;

public class p06_NumberInRange1To100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        while(n < 1 || n > 100) {
            System.out.println("Invalid number!");
            n = Integer.parseInt(scan.nextLine());
        }

        System.out.println(n);
    }
}
