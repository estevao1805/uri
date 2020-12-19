package Uri;

public class Uri1060 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int c = 0;
        for (int i = 1; i <= 6; i++) {
            float x = l.nextFloat();
            c = x > 0 ? c + 1 : c + 0;
        }
        System.out.printf("%d valores positivos\n", c);
    }

}
