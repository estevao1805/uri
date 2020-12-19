package Uri;

public class Uri1097 {

    public static void main(String[] args) {
        int j = 7;
        for (int i = 1; i <= 9; i += 2) {
            for (int k = 0; k < 3; k++) {
                System.out.printf("I=%d J=%d\n", i, j - k);
            }
            j += 2;
        }
    }

}
