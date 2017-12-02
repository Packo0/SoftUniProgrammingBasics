package t08_ExamPreparations.e15_24_April_2016;

import java.util.Scanner;

public class p03_NumberOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        if (operator.equals("+")) {
            System.out.printf("%d + %d = %d - %s", n1, n2, n1 + n2, (n1 + n2) % 2 == 0 ? "even" : "odd");
        } else if (operator.equals("-")) {
            System.out.printf("%d - %d = %d - %s", n1, n2, n1 - n2, (n1 - n2) % 2 == 0 ? "even" : "odd");
        } else if (operator.equals("*")) {
            System.out.printf("%d * %d = %d - %s", n1, n2, n1 * n2, (n1 * n2) % 2 == 0 ? "even" : "odd");
        } else if (operator.equals("%")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                System.out.printf("%d %% %d = %d", n1, n2, n1 % n2);
            }
        } else if (operator.equals("/")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                System.out.printf("%d / %d = %.2f", n1, n2, (double) n1 / n2);
            }

        }

    }
}
