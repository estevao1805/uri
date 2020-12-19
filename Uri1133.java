package Uri;

public class Uri1133 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int x = l.nextInt();
        int y = l.nextInt();

        if (x > y) {
            int aux = y;
            y = x;
            x = aux;
        }

        for (int i = x + 1; i < y; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
    }

}
