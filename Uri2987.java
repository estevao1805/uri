package Uri;

public class Uri2987 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);

        String a[] = new String[26];

        int count = 65;
        for (int i = 0; i < a.length; i++) {
            a[i] = ((char) count) + "";
            count++;
        }

        String x = l.nextLine();

        for (int i = 0; i < a.length; i++) {
            if (x.equals(a[i])) {
                System.out.printf("%d\n", i + 1);
                break;
            }
        }
    }
}
