package t04_ComplexConditionalStatements;

import java.util.Scanner;

public class p16_NumberOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        if(operator.equals("+")) {
            System.out.printf("%d %s %d = %d - %s", num1, operator, num2, num1 + num2, (num1 + num2) % 2 == 0 ? "even" : "odd");
        }

        if(operator.equals("-")) {
            System.out.printf("%d %s %d = %d - %s", num1, operator, num2, num1 - num2, (num1 - num2) % 2 == 0 ? "even" : "odd");
        }

        if(operator.equals("*")) {
            System.out.printf("%d %s %d = %d - %s", num1, operator, num2, num1 * num2, (num1 * num2) % 2 == 0 ? "even" : "odd");
        }

        if(operator.equals("/")) {
            if (num2 == 0 && (operator.equals("/") || operator.equals("%"))) {
                System.out.printf("Cannot divide %d by zero", num1); return;
            }

            System.out.printf("%d %s %d = %.2f", num1, operator, num2, num1 / (double)num2);
        }

        if(operator.equals("%")) {
            if (num2 == 0 && (operator.equals("/") || operator.equals("%"))) {
                System.out.printf("Cannot divide %d by zero", num1); return;
            }

            System.out.printf("%d %s %d = %d", num1, operator, num2, num1 % num2);
        }

    }
}
