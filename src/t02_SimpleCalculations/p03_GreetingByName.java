package t02_SimpleCalculations;

import java.util.Scanner;

public class p03_GreetingByName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.printf("Hello %s!", name);
    }
}
