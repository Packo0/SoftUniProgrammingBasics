package t08_ExamPreparations.e03_03_September_2017;

import java.util.Scanner;

public class p03_PhotoPictures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int picturesCount = Integer.parseInt(scan.nextLine());
        String picturesType = scan.nextLine();
        String orderWay = scan.nextLine();

        double totalResult = -1;

        switch(picturesType){
            case "9X13":
                totalResult = picturesCount * 0.16;
                if(picturesCount >= 50) {
                    totalResult -= totalResult * 0.05;
                }

                if(orderWay.equals("online")) {
                    totalResult -= totalResult * 0.02;
                }
                break;
            case "10X15":
                totalResult = picturesCount * 0.16;
                if(picturesCount >= 80) {
                    totalResult -= totalResult * 0.03;
                }

                if(orderWay.equals("online")) {
                    totalResult -= totalResult * 0.02;
                }
                break;
            case "13X18":
                totalResult = picturesCount * 0.38;
                if(picturesCount >= 50 && picturesCount <= 100) {
                    totalResult -= totalResult * 0.03;
                }

                if(picturesCount > 100) {
                    totalResult -= totalResult * 0.05;
                }

                if(orderWay.equals("online")) {
                    totalResult -= totalResult * 0.02;
                }
                break;
            case "20X30":
                totalResult = picturesCount * 2.90;
                if(picturesCount >= 10 && picturesCount <= 50) {
                    totalResult -= totalResult * 0.07;
                }

                if(picturesCount > 50) {
                    totalResult -= totalResult * 0.09;
                }

                if(orderWay.equals("online")) {
                    totalResult -= totalResult * 0.02;
                }
                break;
        }

        System.out.printf("%.2fBGN", totalResult);
    }
}
