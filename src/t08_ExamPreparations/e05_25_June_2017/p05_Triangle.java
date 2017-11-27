package t08_ExamPreparations.e05_25_June_2017;

import java.util.Scanner;

public class p05_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        // first row
        System.out.println(repeatStr("#", 4 * n + 1));

        int daises = 2*n - 1;
        int dots = 1;
        int spaces = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr(".", dots));
            System.out.print(repeatStr("#", daises));
            if(i == n / 2) {
                System.out.print(repeatStr(" ", (spaces - 3) / 2));
                System.out.print("(@)");
                System.out.print(repeatStr(" ", (spaces - 3) / 2));
            } else {
                System.out.print(repeatStr(" ", spaces));
            }

            System.out.print(repeatStr("#", daises));
            System.out.println(repeatStr(".", dots));

            daises -= 2;
            dots++;
            spaces+=2;
        }

        //bottom
        daises = 2*n -1;
        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr(".", dots));
            System.out.print(repeatStr("#", daises));
            System.out.println(repeatStr(".", dots));

            daises -= 2;
            dots++;
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
