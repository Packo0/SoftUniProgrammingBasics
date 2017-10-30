package t04_ComplexConditionalStatements;

import java.util.Scanner;

public class p06_PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        boolean isOnLeftOrRightBorder = (x1 == x || x == x2) && (y1 <= y && y <= y2);
        boolean isOnTopOrBottomBorder = (y1 == y || y == y2) && (x1 <= x && x <= x2);

        if (isOnLeftOrRightBorder || isOnTopOrBottomBorder) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
