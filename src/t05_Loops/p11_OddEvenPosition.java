package t05_Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p11_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#######################");
        int n = Integer.parseInt(scan.nextLine());
        double min = 1000000000.0;
        double max = -1000000000.0;
        double oddSum = 0;
        double oddMin = min;
        double oddMax = max;
        double evenSum = 0;
        double evenMin = min;
        double evenMax = max;

        for (int i = 1; i <= n; i++) {
            double currentNum = Double.parseDouble(scan.nextLine());

            if (i % 2 == 0) {
                evenSum += currentNum;

                if(currentNum > evenMax) {
                    evenMax = currentNum;
                }

                if (currentNum < evenMin) {
                    evenMin = currentNum;
                }
            } else {
                oddSum += currentNum;

                if(currentNum > oddMax) {
                    oddMax = currentNum;
                }

                if (currentNum < oddMin) {
                    oddMin = currentNum;
                }
            }
        }

        System.out.printf("OddSum=%s%n", df.format(oddSum));

        if(oddMin != min) {
            System.out.printf("OddMin=%s%n", df.format(oddMin));
        } else {
            System.out.println("OddMin = No");
        }

        if(oddMax != max) {
            System.out.printf("OddMax=%s%n", df.format(oddMax));
        } else {
            System.out.println("OddMax No");
        }

        System.out.printf("EvenSum=%s%n", df.format(evenSum));

        if(evenMin != min) {
            System.out.printf("EvenMin=%s%n", df.format(evenMin));
        } else {
            System.out.println("EvenMin = No");
        }

        if(evenMax != max) {
            System.out.printf("EvenMax=%s%n", df.format(evenMax));
        } else {
            System.out.println("EvenMax = No");
        }

    }
}
