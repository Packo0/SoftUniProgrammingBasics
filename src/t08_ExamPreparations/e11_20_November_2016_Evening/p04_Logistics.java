package t08_ExamPreparations.e11_20_November_2016_Evening;

import java.util.Scanner;

public class p04_Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLoads = Integer.parseInt(scan.nextLine());

        double totalLoads = 0;
        double bus = 0;
        double truck = 0;
        double train = 0;
        for (int i = 0; i < numberOfLoads; i++) {
            int currentTons = Integer.parseInt(scan.nextLine());

            totalLoads += currentTons;
            if(currentTons <= 3) {
                bus += currentTons;
            } else if (currentTons <= 11) {
                truck += currentTons;
            } else {
                train += currentTons;
            }
        }

        double average = (bus * 200 + truck * 175 + train * 120) / totalLoads;
        System.out.printf("%.2f%n", average);
        System.out.printf("%.2f%%%n", bus / totalLoads * 100);
        System.out.printf("%.2f%%%n", truck / totalLoads * 100);
        System.out.printf("%.2f%%%n", train / totalLoads * 100);
    }
}
