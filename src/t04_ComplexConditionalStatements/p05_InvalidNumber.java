package t04_ComplexConditionalStatements;

import java.util.Scanner;

public class p05_InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());

        boolean isInRange = (100 <= number && number <= 200) || number == 0;
        if(!isInRange) {
            System.out.println("invalid");
        }
    }
}
