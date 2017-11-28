package t08_ExamPreparations.e11_20_November_2017_Morning;

import java.util.Scanner;

public class p02_Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int foodLeft = Integer.parseInt(scan.nextLine());
        double foodForDog = Double.parseDouble(scan.nextLine());
        double foodForCat = Double.parseDouble(scan.nextLine());
        double foodForTortoise = Double.parseDouble(scan.nextLine());

        double dog = days * foodForDog;
        double cat = days * foodForCat;
        double tortoise = (days * foodForTortoise) / 1000;

        double totalFood = dog + cat + tortoise;

        if(foodLeft >= totalFood) {
            System.out.printf("%d kilos of food left.", (int)(foodLeft - totalFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFood - foodLeft));
        }
    }
}
