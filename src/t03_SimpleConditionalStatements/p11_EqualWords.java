package t03_SimpleConditionalStatements;

import java.util.Scanner;

public class p11_EqualWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String wordOne = scan.nextLine();
        String wordTwo = scan.nextLine();

        if (wordOne.toLowerCase().equals(wordTwo.toLowerCase())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
