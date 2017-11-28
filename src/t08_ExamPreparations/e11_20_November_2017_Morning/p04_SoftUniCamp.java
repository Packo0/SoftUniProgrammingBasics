package t08_ExamPreparations.e11_20_November_2017_Morning;

import java.util.Scanner;

public class p04_SoftUniCamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groups = Integer.parseInt(scan.nextLine());

        double car = 0;
        double miniBus = 0;
        double microBus = 0;
        double bus = 0;
        double train = 0;
        double allPeople = 0;
        for (int i = 0; i < groups; i++) {
            int currentGroup = Integer.parseInt(scan.nextLine());
            allPeople += currentGroup;
            if(currentGroup <= 5) {
                car += currentGroup;
            } else if (currentGroup <= 12) {
                miniBus += currentGroup;
            } else if (currentGroup <= 25) {
                microBus += currentGroup;
            } else if (currentGroup <= 40) {
                bus += currentGroup;
            } else {
                train += currentGroup;
            }
        }

        System.out.printf("%.2f%%%n", car / allPeople * 100);
        System.out.printf("%.2f%%%n", miniBus / allPeople * 100);
        System.out.printf("%.2f%%%n", microBus / allPeople * 100);
        System.out.printf("%.2f%%%n", bus / allPeople * 100);
        System.out.printf("%.2f%%%n", train / allPeople * 100);
    }
}
