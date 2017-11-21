package t07_AdvancedLoops;

import java.util.Scanner;

public class t10_CheckPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        boolean isPrime = true;

        if (n < 2) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
