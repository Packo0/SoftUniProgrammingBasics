package t03_SimpleConditionalStatements;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p18_PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int v = Integer.parseInt(scan.nextLine());
         int p1 = Integer.parseInt(scan.nextLine());
         int p2 = Integer.parseInt(scan.nextLine());
         double h = Double.parseDouble(scan.nextLine());
        DecimalFormat   df = new DecimalFormat("0.##");

         double pipe1Litres = p1 * h;
         double pipe2Litres = p2 * h;

         double totalFull = pipe1Litres + pipe2Litres;

         if(totalFull <= v) {
             double percentFull = Math.floor((totalFull / v) * 100);
             double percentPipe1 = Math.floor((pipe1Litres / totalFull) * 100);
             double percentPipe2 = Math.floor((pipe2Litres / totalFull) * 100);
             System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.", percentFull, percentPipe1, percentPipe2);
         } else {
             double overflow = (pipe1Litres + pipe2Litres) - v;
             System.out.printf("For %s hours the pool overflows with %.1f liters.", df.format(h), overflow);
         }

    }
}
