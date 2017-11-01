package t04_ComplexConditionalStatements;

import java.util.Scanner;

public class p13_PointInTheFigure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        boolean firstRectangle = (x > h && x < 2 * h && y >= h && y < 4 * h);
        boolean secondRectangle = (x > 0 && x < 3 * h && y > 0 && y < h);

        boolean firstTop = (y == 4 * h && x >= h && x <= 2 * h);      //(y == 4*h && x >= h && x <= 2*h)
        boolean firstLeft = (x == h && y >= h && y <= 4 * h);      //(x == h && y >= h && y <= 4*h )
        boolean firstRight = (x == 2 * h && y >= h && y <= 4 * h);   //(x == 2*h && y >= h && y <= 4*h)
        boolean secondUpLeft = (y == h && x >= 0 && x <= h);           //(y == h && x >= 0 && x <= h)
        boolean secondUpRight = (y == h && x >= 2 * h && x <= 3 * h);   //(y == h && x >= 2*h && x <=3*h)
        boolean secondLeft = (x == 0 && y >= 0 && y <= h);           //(x == 0 && y >=0 && y <= h )
        boolean secondRight = (x == 3 * h && y >= 0 && y <= h);    //(x == 3*h && y <=h && y >=0)
        boolean secondDown = (y == 0 && x >= 0 && x <= 3 * h);      //(y == 0 && x >= 0 && x <= 3*h)

        if (firstRectangle || secondRectangle) {
            System.out.println("inside");
        } else if (firstTop || firstLeft || firstRight || secondUpLeft || secondUpRight || secondLeft || secondRight || secondDown) {
            System.out.println("border");
        } else {
            System.out.println("outside");
        }
    }
}
