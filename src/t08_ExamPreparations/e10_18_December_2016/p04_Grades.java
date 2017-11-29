package t08_ExamPreparations.e10_18_December_2016;

import java.util.Scanner;

public class p04_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scan.nextLine());

        double fail = 0;
        double poor = 0;
        double good = 0;
        double top = 0;
        double sum = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            double currentMark = Double.parseDouble(scan.nextLine());
            sum += currentMark;
            if(2 <= currentMark && currentMark <= 2.99) {
                fail++;
            } else if (3 <= currentMark && currentMark <= 3.99) {
                poor++;
            } else if (4 <= currentMark && currentMark <= 4.99) {
                good++;
            } else {
                top++;
            }
        }

        System.out.printf("Top students: %.2f%%%n", top / numberOfStudents * 100.0);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", good / numberOfStudents * 100.0);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", poor / numberOfStudents * 100.0);
        System.out.printf("Fail: %.2f%%%n", fail / numberOfStudents * 100.0);
        System.out.printf("Average: %.2f", sum / numberOfStudents);
    }
}
