package t08_ExamPreparations.e07_19_March_2017_Evening;

        import java.util.Scanner;

public class p03_TruckDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        double km = Double.parseDouble(scan.nextLine());

        double salary = 0;
        if (1000 < km && km <= 20000) {
            salary = 1.45 * km;
        }

        if(season.equals("Spring") || season.equals("Autumn")) {
            if(km <= 5000) {
                salary = 0.75 * km;
            } else if (km <= 10000) {
                salary = 0.95 * km;
            }
        } else if (season.equals("Summer")) {
            if(km <= 5000) {
                salary = 0.90 * km;
            } else if (km <= 10000) {
                salary = 1.10 * km;
            }
        } else if (season.equals("Winter")) {
            if(km <= 5000) {
                salary = 1.05 * km;
            } else if (km <= 10000) {
                salary = 1.25 * km;
            }
        }
        salary = salary * 4;
        salary = salary - 0.1 * salary;

        System.out.printf("%.2f", salary);
    }
}
