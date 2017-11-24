package t08_ExamPreparations.e02_17_September_2017;

import java.util.Scanner;

public class p01_Birthday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int longitude = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double volume = longitude * width * height;

        double result = (volume * 0.001) * (1 - percent * 0.01);
        System.out.printf("%.3f", result);

    }
}
