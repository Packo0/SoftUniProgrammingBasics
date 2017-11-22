package t07_AdvancedLoops;

import java.util.Scanner;

public class p13_NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 0, rowNumber = 1;
        while(count != n) {
            for (int i = 0; i < rowNumber; i++) {
                count++;
                System.out.print(count + " ");
                if(count == n) {
                    return;
                }
            }

            rowNumber++;
            System.out.println();
        }
    }
}
