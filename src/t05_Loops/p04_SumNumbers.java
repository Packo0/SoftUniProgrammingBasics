package t05_Loops;

import java.util.Scanner;

public class p04_SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
        }

        System.out.println(sum);
    }
}
