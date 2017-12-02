package t08_ExamPreparations.e17_6_March_2016;

import java.util.Scanner;

public class p01_TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        int desksPerRow = (int)((h * 100 - 100) / 70);

        int rows = (int)(w * 100 / 120);
        int seats = rows * desksPerRow - 3;

        System.out.println(seats);
    }
}
