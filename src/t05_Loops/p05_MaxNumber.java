package t05_Loops;

        import java.util.Scanner;

public class p05_MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        int max = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < num - 1; i++) {
            int nextNumber = Integer.parseInt(scan.nextLine());
            if(nextNumber > max) {
                max = nextNumber;
            }
        }

        System.out.println(max);
    }
}
