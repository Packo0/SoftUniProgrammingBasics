package t04_ComplexConditionalStatements;

import java.util.Scanner;

public class p02_SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = -1;

        if(town.equals("Sofia")) {
            if(product.equals("coffee")) {
                price = 0.50;
            } else if (product.equals("water")) {
                price = 0.80;
            } else if (product.equals("beer")) {
                price = 1.20;
            } else if(product.equals("sweets")){
                price = 1.45;
            } else {
                price = 1.60;
            }
        } else if(town.equals("Plovdiv")) {
            if(product.equals("coffee")) {
                price = 0.40;
            } else if (product.equals("water")) {
                price = 0.70;
            } else if (product.equals("beer")) {
                price = 1.15;
            } else if(product.equals("sweets")){
                price = 1.30;
            } else {
                price = 1.50;
            }
        } else {
            if(product.equals("coffee")) {
                price = 0.45;
            } else if (product.equals("water")) {
                price = 0.70;
            } else if (product.equals("beer")) {
                price = 1.10;
            } else if(product.equals("sweets")){
                price = 1.35;
            } else {
                price = 1.55;
            }
        }

        System.out.println(price * quantity);
    }
}
