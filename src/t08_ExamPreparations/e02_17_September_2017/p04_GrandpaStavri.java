package t08_ExamPreparations.e02_17_September_2017;

import java.util.Scanner;

public class p04_GrandpaStavri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double result = 0;
        double totalQuantity = 0;
        for (int i = 0; i < n; i++) {
            double rakiqQuantity = Double.parseDouble(scan.nextLine());
            double rakiqDegree = Double.parseDouble(scan.nextLine());

            totalQuantity += rakiqQuantity;
            result += rakiqDegree * rakiqQuantity;
        }

        double degree = result / totalQuantity;

        System.out.printf("Liter: %.2f%n", totalQuantity);
        System.out.printf("Degrees: %.2f%n", degree);

        if(degree < 38) {
            System.out.println("Not good, you should baking!");
        } else if (degree < 42) {
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
