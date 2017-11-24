package t08_ExamPreparations.e03_03_September_2017;

import java.util.Scanner;

public class p04_Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int area = width * height;
        int sum = 0;

        while(true) {
            String currentPiece = scan.nextLine();

            if(currentPiece.equals("STOP")) {
                if(area > sum) {
                    System.out.printf("%d pieces are left.", area-sum);
                }

                return;
            }

            int currentPieceNum = Integer.parseInt(currentPiece);
            sum += currentPieceNum;

            if(area < sum) {
                System.out.printf("No more cake left! You need %d pieces more.", sum - area);
                return;
            }

        }
    }
}
