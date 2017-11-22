package t07_AdvancedLoops;

import java.util.Scanner;

public class p11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        try {
            n = Integer.parseInt(scan.nextLine());
            while(true) {
                if(n % 2 == 0) {
                    System.out.println(n);
                    break;
                } else {
                    System.out.println("The number is not even.");
                    n = Integer.parseInt(scan.nextLine());
                }
            }
        } catch (Exception ex) {
            System.out.println("Invalid Number");
        }
    }
}
