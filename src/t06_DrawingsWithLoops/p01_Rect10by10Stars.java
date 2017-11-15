package t06_DrawingsWithLoops;

public class p01_Rect10by10Stars {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(repeatString("*", 10));
        }
    }

    private static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
