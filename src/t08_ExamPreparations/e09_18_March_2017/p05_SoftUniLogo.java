package t08_ExamPreparations.e09_18_March_2017;

import java.util.Scanner;

public class p05_SoftUniLogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int width = 12 * n - 5;
        int height = 4 * n - 2;

        //top part
        int dieses = 1;
        int dots = (width - dieses) / 2;
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(repeatStr(".", dots));
            System.out.print(repeatStr("#", dieses));
            System.out.println(repeatStr(".", dots));

            dieses += 6;
            dots -= 3;
        }

        dots = 3;
        dieses = width - 6;
        for (int i = 0; i < n - 2; i++) {
            System.out.print("|");
            System.out.print(repeatStr(".", dots - 1));
            System.out.print(repeatStr("#", dieses));
            System.out.println(repeatStr(".", dots));

            dots += 3;
            dieses -= 6;
        }

        //bottom part
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print("@");
            } else {
                System.out.print("|");
            }
            System.out.print(repeatStr(".", dots - 1));
            System.out.print(repeatStr("#", dieses));
            System.out.println(repeatStr(".", dots));
        }
    }

    private static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
