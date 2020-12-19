package Uri;

public class Uri1837 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int qnt = l.nextInt();
        l.nextLine();
        for (int i = 1; i <= qnt; i++) {
            String r = l.nextLine();
            String s = l.nextLine();
            if (r.equals(s)) {
                System.out.printf("empate\n");
            } else if ((r.equals("tesoura") && s.equals("papel"))
                    || (r.equals("papel") && s.equals("pedra"))
                    || (r.equals("tesoura") && s.equals("papel"))
                    || (r.equals("pedra") && s.equals("lagarto"))
                    || (r.equals("lagarto") && s.equals("spock"))
                    || (r.equals("spock") && s.equals("tesoura"))
                    || (r.equals("tesoura") && s.equals("lagarto"))
                    || (r.equals("lagarto") && s.equals("papel"))
                    || (r.equals("papel") && s.equals("spock"))
                    || (r.equals("spock") && s.equals("pedra"))
                    || (r.equals("pedra") && s.equals("tesoura"))) {
                System.out.printf("rajesh\n");
            } else {
                System.out.printf("sheldon\n");
            }

        }
    }

}
