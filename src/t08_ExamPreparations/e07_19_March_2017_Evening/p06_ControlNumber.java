package t08_ExamPreparations.e07_19_March_2017_Evening;

import java.util.Scanner;

public class p06_ControlNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int controlNum = Integer.parseInt(scan.nextLine());
        boolean flag = false;
        int moves = 0;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (sum >= controlNum) {
                flag = true;
                break;
            }

            for (int j = m; j >= 1; j--) {
                sum += i * 2 + j * 3;
                    moves++;
                if (sum >= controlNum) {
                    flag = true;
                    break;
                }
            }
        }

        if (flag) {
            System.out.printf("%d moves%n", moves);
            System.out.printf("Score: %d >= %d", sum, controlNum);
        } else {
            System.out.printf("%d moves", moves);
        }
    }
}
