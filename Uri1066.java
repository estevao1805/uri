package Uri;

public class Uri1066
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int pares = 0, impares = 0, positivos = 0, negativos = 0;
        for (int i = 1; i <= 5; i++)
        {
            int x = l.nextInt();
            if (x % 2 == 0)
            {
                pares++;
            } else
            {
                impares++;
            }
            if (x > 0)
            {
                positivos++;
            }
            if (x < 0)
            {
                negativos++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n", pares);
        System.out.printf("%d valor(es) impar(es)\n", impares);
        System.out.printf("%d valor(es) positivo(s)\n", positivos);
        System.out.printf("%d valor(es) negativo(s)\n", negativos);
    }

}
