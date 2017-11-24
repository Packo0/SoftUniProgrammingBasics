package t08_ExamPreparations.e02_17_September_2017;

import java.util.Scanner;

public class p05_Sheriff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //first three rows
        int dots = (3 * n - 1) / 2;
        System.out.print(repeatString(".", dots));
        System.out.print("x");
        System.out.println(repeatString(".", dots));
        //second row
        dots = (3 * n - 3) / 2;
        System.out.print(repeatString(".", dots));
        System.out.print("/x\\");
        System.out.println(repeatString(".", dots));
        //third row
        System.out.print(repeatString(".", dots));
        System.out.print("x|x");
        System.out.println(repeatString(".", dots));

        //middle part
        dots = (3 * n - 2 * n - 1) / 2;
        int x = n;
        for (int i = 0; i < n; i++) {
            System.out.print(repeatString(".", dots));
            System.out.print(repeatString("x", x));
            System.out.print("|");
            System.out.print(repeatString("x", x));
            System.out.println(repeatString(".", dots));

            if(dots == 0)
                break;

            dots--;
            x++;
        }

        if(n!= 1){
            for (int i = 0; i < n; i++) {
                dots++;
                x--;

                System.out.print(repeatString(".", dots));
                System.out.print(repeatString("x", x));
                System.out.print("|");
                System.out.print(repeatString("x", x));
                System.out.println(repeatString(".", dots));

                if(dots == ((3 * n - 2 * n - 1) / 2))
                    break;
            }
        }


        //two rows
        dots = (3 * n - 1) / 2;
        System.out.print(repeatString(".", dots - 1));
        System.out.print("/x\\");
        System.out.println(repeatString(".", dots - 1));

        System.out.print(repeatString(".", dots - 1));
        System.out.print("\\x/");
        System.out.println(repeatString(".", dots - 1));

        //middle part
        dots = (3 * n - 2 * n - 1) / 2;
        x = n;
        for (int i = 0; i < n; i++) {
            System.out.print(repeatString(".", dots));
            System.out.print(repeatString("x", x));
            System.out.print("|");
            System.out.print(repeatString("x", x));
            System.out.println(repeatString(".", dots));

            if(dots == 0)
                break;

            dots--;
            x++;
        }

        if(n !=1){
            for (int i = 0; i < n; i++) {
                dots++;
                x--;

                System.out.print(repeatString(".", dots));
                System.out.print(repeatString("x", x));
                System.out.print("|");
                System.out.print(repeatString("x", x));
                System.out.println(repeatString(".", dots));

                if(dots == ((3 * n - 2 * n - 1) / 2))
                    break;
            }
        }


        dots = (3 * n - 1) / 2;
        //third row
        System.out.print(repeatString(".", dots - 1));
        System.out.print("x|x");
        System.out.println(repeatString(".", dots - 1));
        //second row
        System.out.print(repeatString(".", dots - 1));
        System.out.print("\\x/");
        System.out.println(repeatString(".", dots - 1));

        System.out.print(repeatString(".", dots));
        System.out.print("x");
        System.out.println(repeatString(".", dots));

    }

    private static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
