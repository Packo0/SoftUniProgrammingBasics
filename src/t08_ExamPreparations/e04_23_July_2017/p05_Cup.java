package t08_ExamPreparations.e04_23_July_2017;

import java.util.Scanner;

public class p05_Cup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int dots = n;
        int diesis =  3 * n;

        for (int i = 0; i < n / 2; i++) {
            System.out.print(repeatStr(".", dots));
            System.out.print(repeatStr("#", diesis));
            System.out.println(repeatStr(".", dots));

            dots += 1;
            diesis -= 2;
        }

        int middle = 5 * n - 2 * dots - 2;
        for (int i = 0; i < n / 2 + 1; i++) {
            System.out.print(repeatStr(".", dots));
            System.out.print("#");
            System.out.print(repeatStr(".", middle));
            System.out.print("#");
            System.out.println(repeatStr(".", dots));

            dots++;
            middle -= 2;
        }

        dots--;
        System.out.print(repeatStr(".", dots));
        System.out.print(repeatStr("#", 5*n - 2 * dots));
        System.out.println(repeatStr(".", dots));

        dots-=2;
        for (int i = 0; i < n + 2; i++) {
            if(i == n / 2) {
                System.out.print(repeatStr(".", (5*n - 10) / 2));
                System.out.print("D^A^N^C^E^");
                System.out.println(repeatStr(".", (5*n - 10) / 2));
                continue;
            }

            System.out.print(repeatStr(".", dots));
            System.out.print(repeatStr("#", 5*n - 2 * dots));
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
