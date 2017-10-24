import java.util.Scanner;

public class p06_SquareOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");

            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

    }
}
