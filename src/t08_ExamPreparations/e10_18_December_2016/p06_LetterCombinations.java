package t08_ExamPreparations.e10_18_December_2016;

import java.util.Scanner;

public class p06_LetterCombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char begin = scan.nextLine().charAt(0);
        char end = scan.nextLine().charAt(0);
        char letter = scan.nextLine().charAt(0);

        int count = 0;
        for (char i = begin; i <= end; i++) {
            for (char j = begin; j <= end; j++) {
                for (char k = begin; k <= end; k++) {
                    if(letter == i || letter == j || letter == k) {
                        continue;
                    }

                    count++;
                    System.out.print("" + i + j + k + " ");
                }
            }
        }

        System.out.println(count);
    }
}
