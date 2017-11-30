package t08_ExamPreparations.e08_19_March_2017_Morning;

import java.util.Scanner;

public class p04_TrainersSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLectures = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());

        int jelev = 0;
        int royal = 0;
        int roli = 0;
        int trofon = 0;
        int sino = 0;
        int others = 0;

        for (int i = 1; i <= numberOfLectures; i++) {
            String currentLector = scan.nextLine();

            switch (currentLector) {
                case "Jelev": jelev++; break;
                case "RoYaL": royal++; break;
                case "Roli": roli++; break;
                case "Trofon": trofon++; break;
                case "Sino": sino++; break;
                default: others++; break;
            }
        }

        double priceForLecture = budget / numberOfLectures;
        System.out.printf("Jelev salary: %.2f lv%n", priceForLecture * jelev);
        System.out.printf("RoYaL salary: %.2f lv%n", priceForLecture * royal);
        System.out.printf("Roli salary: %.2f lv%n", priceForLecture * roli);
        System.out.printf("Trofon salary: %.2f lv%n", priceForLecture * trofon);
        System.out.printf("Sino salary: %.2f lv%n", priceForLecture * sino);
        System.out.printf("Others salary: %.2f lv", priceForLecture * others);
    }
}
