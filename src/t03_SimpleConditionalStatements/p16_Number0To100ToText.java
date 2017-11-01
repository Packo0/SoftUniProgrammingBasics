package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p16_Number0To100ToText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"};

        int digitOne = num / 10;
        int digitTwo = num % 10;

        if (0 <= num && num <= 19) {
            System.out.println(units[num]);
        } else if (19 < num && num < 100) {
            if (digitTwo == 0) {
                System.out.println(tens[digitOne - 2]);
            } else {
                System.out.printf("%s %s", tens[digitOne - 2], units[digitTwo]);
            }
        } else if(num == 100){
            System.out.println("one hundred");
        } else {
            System.out.println("invalid number");
        }
    }
}
