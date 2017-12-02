package t08_ExamPreparations.e16_26_March_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p01_VegetableStock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vegetablePrice = Double.parseDouble(scan.nextLine());
        double fruitPrice = Double.parseDouble(scan.nextLine());
        int totalKgVegetables = Integer.parseInt(scan.nextLine());
        int totalKgFruits = Integer.parseInt(scan.nextLine());
        DecimalFormat df = new DecimalFormat("#.###############################");
        double totalPriceVegetables = vegetablePrice * totalKgVegetables;
        double totalPriceFruits = fruitPrice * totalKgFruits;
        double totalIncome = totalPriceVegetables + totalPriceFruits;

        System.out.printf("%s", df.format(totalIncome / 1.94));
    }
}
