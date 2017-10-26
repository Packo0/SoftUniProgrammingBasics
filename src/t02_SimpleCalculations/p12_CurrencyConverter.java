package t02_SimpleCalculations;

import java.util.Scanner;

public class p12_CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double currency = Double.parseDouble(scan.nextLine());
        String inputCurrency = scan.nextLine();
        String outputCurrency = scan.nextLine();

        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;

        if (inputCurrency.equals("USD")) {
            currency *= usd;
        } else if (inputCurrency.equals("EUR")) {
            currency *= eur;
        } else if (inputCurrency.equals("GBP")) {
            currency *= gbp;
        }

        if (outputCurrency.equals("USD")) {
            currency /= usd;
        } else if (outputCurrency.equals("EUR")) {
            currency /= eur;
        } else if (outputCurrency.equals("GBP")) {
            currency /= gbp;
        }

        System.out.printf("%.2f", currency);
    }
}
