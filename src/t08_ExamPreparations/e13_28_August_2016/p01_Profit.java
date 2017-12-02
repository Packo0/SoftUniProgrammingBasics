package t08_ExamPreparations.e13_28_August_2016;

import java.util.Scanner;

public class p01_Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int workDays = Integer.parseInt(scan.nextLine());
        double money = Double.parseDouble(scan.nextLine());
        double dollarCourse = Double.parseDouble(scan.nextLine());

        double monthSalary = workDays * money;
        double annualIncome = monthSalary * 12 + monthSalary * 2.5;
        double left = annualIncome - annualIncome * 0.25;
        double leftInLv = left * dollarCourse;

        System.out.printf("%.2f", leftInLv / 365);
    }
}
