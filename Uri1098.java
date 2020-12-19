 package Uri;

public class Uri1098 {

    public static void main(String[] args) {
        float ac = 0;

        for (float i = 0; i <= 2.2; i += 0.2) {
            for (float j = 1; j <= 3; j++) {
                System.out.printf("I=%.1f J=%.1f\n", i, j + ac);
            }
            ac += 0.2;
        }
    }

}
