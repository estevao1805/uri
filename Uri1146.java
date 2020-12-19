package Uri;

public class Uri1146 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int x;
        while ((x = l.nextInt()) > 0) {

            for (int i = 1; i < x; i++) {
                System.out.printf("%d ", i);
            }
            System.out.printf("%d\n", x);
        }
    }

}
