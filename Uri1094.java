package Uri;

public class Uri1094 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);

        int qnt;
        int totalDeCobaias = 0, coelhos = 0, sapos = 0, ratos = 0;
        String type;

        int v = l.nextInt();

        for (int i = 1; i <= v; i++) {
            qnt = l.nextInt();
            type = l.nextLine();
            
            totalDeCobaias += qnt;

            switch (type) {
                case " C":
                    coelhos += qnt;
                    break;
                case " R":
                    ratos += qnt;
                    break;
                case " S":
                    sapos += qnt;
                    break;
            }
        }
        System.out.printf("Total: %d cobaias\n", totalDeCobaias);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.printf("Percentual de coelhos: %.2f ", (float) (100 * coelhos) /totalDeCobaias);
        System.out.println("%");
        System.out.printf("Percentual de ratos: %.2f ", (float) (100 * ratos) / totalDeCobaias);
        System.out.println("%");
        System.out.printf("Percentual de Sapos: %.2f ", (float) (100 * sapos) / totalDeCobaias);
        System.out.println("%");
    }


}
