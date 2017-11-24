package t08_ExamPreparations.e02_17_September_2017;

import java.util.Scanner;

public class p03_MobileOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String contractDuration = scan.nextLine();
        String contractType = scan.nextLine();
        String internet = scan.nextLine();
        int months = Integer.parseInt(scan.nextLine());

        double result = 0;
        if (contractDuration.equals("one")) {
            if (contractType.equals("Small")) {
                if (internet.equals("yes")) {
                    result = (9.98 + 5.50) * months;
                } else if (internet.equals("no")) {
                    result = 9.98 * months;
                }
            } else if (contractType.equals("Middle")) {
                if (internet.equals("yes")) {
                    result = (18.99 + 4.35) * months;
                } else if (internet.equals("no")) {
                    result = 18.99 * months;
                }
            } else if (contractType.equals("Large")) {
                if (internet.equals("yes")) {
                    result = (25.98 + 4.35) * months;
                } else if (internet.equals("no")) {
                    result = 25.98 * months;
                }
            } else if (contractType.equals("ExtraLarge")) {
                if (internet.equals("yes")) {
                    result = (35.99 + 3.85) * months;
                } else if (internet.equals("no")) {
                    result = 35.99 * months;
                }
            }
        } else if (contractDuration.equals("two")) {
            if (contractType.equals("Small")) {
                if (internet.equals("yes")) {
                    result = (8.58 + 5.50) * months;
                } else if (internet.equals("no")) {
                    result = 8.58 * months;
                }
            } else if (contractType.equals("Middle")) {
                if (internet.equals("yes")) {
                    result = (17.09 + 4.35) * months;
                } else if (internet.equals("no")) {
                    result = 17.09 * months;
                }
            } else if (contractType.equals("Large")) {
                if (internet.equals("yes")) {
                    result = (23.59 + 4.35) * months;
                } else if (internet.equals("no")) {
                    result = 23.59 * months;
                }
            } else if (contractType.equals("ExtraLarge")) {
                if (internet.equals("yes")) {
                    result = (31.79 + 3.85) * months;
                } else if (internet.equals("no")) {
                    result = 31.79 * months;
                }
            }
        }

        if(contractDuration.equals("two")) {
            result = result - 0.0375 * result;
        }

        System.out.printf("%.2f lv.", result);

    }
}
