package t08_ExamPreparations.e11_20_November_2016_Evening;

import java.util.Scanner;

public class p02_FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfMagnolia = Integer.parseInt(scan.nextLine());
        int numberOfHyacinths = Integer.parseInt(scan.nextLine());
        int numberOfRoses = Integer.parseInt(scan.nextLine());
        int numberOfCacti = Integer.parseInt(scan.nextLine());
        double presentPrice = Double.parseDouble(scan.nextLine());

        double sum = numberOfMagnolia * 3.25 + numberOfHyacinths * 4 + numberOfRoses * 3.5 + numberOfCacti * 8;

        sum -= sum * 0.05;

        if(presentPrice > sum) {
            System.out.printf("She will have to borrow %d leva.", (int)Math.ceil(presentPrice - sum));
        } else {
            System.out.printf("She is left with %.0f leva.", Math.floor(sum - presentPrice));
        }
    }
}
