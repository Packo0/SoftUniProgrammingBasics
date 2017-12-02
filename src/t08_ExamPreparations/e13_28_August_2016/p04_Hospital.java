package t08_ExamPreparations.e13_28_August_2016;

import java.util.Scanner;

public class p04_Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());

        int treated = 0;
        int untreated = 0;
        int doctors = 7;
        for (int i = 1; i <= days; i++) {
            int patientsForDay = Integer.parseInt(scan.nextLine());

            if (i % 3 == 0  && untreated > treated) {
                doctors++;
            }

            if (patientsForDay <= doctors) {
                treated += patientsForDay;
            } else {
                treated += doctors;
                untreated += patientsForDay - doctors;
            }
        }

        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.", untreated);
    }
}
