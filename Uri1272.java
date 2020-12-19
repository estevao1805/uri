package Uri;

public class Uri1272 {

    public static void main(String[] args) {
        java.util.Scanner leia = new java.util.Scanner(System.in);
        int qnt = leia.nextInt();
        leia.nextLine();

        for (int k = 1; k <= qnt; k++) {
            String m = leia.nextLine();
            m = m.trim();
            int t = m.length();
            boolean h = true;
            String s = "";
            for (int i = 0; i < t; i++) {
                char p = m.charAt(i);
                if (h && p != ' ') {
                    s += p;
                    h = false;
                }
                if (p == ' ') {
                    h = true;
                }
            }
            System.out.printf("%s\n", s);
        }
    }
}
