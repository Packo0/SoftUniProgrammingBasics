package t08_ExamPreparations.e05_25_June_2017;

import java.util.Scanner;

public class p05_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pieces = Integer.parseInt(scan.nextLine());
    }

    private static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
