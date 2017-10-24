import java.util.Scanner;

public class p07_2DRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double sideA = Math.abs(x2 - x1);
        double sideB = Math.abs(y2 - y1);

        double area = sideA * sideB;
        double perimeter = 2*(sideA + sideB);

        System.out.println(area);
        System.out.println(perimeter);


    }
}
