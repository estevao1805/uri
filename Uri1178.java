package Uri;

public class Uri1178
{

    public static void main(String args[])
    {
        java.util.Scanner l = new java.util.Scanner(System.in);

        double vetor[] = new double[100];

        double n = l.nextDouble();

        for (int i = 0; i < vetor.length; i++)
        {
            vetor[i] = n;
            n /= 2;
        }

        for (int i = 0; i < vetor.length; i++)
        {
            System.out.printf("N[%d] = %.4f\n", i, vetor[i]);
        }
    }
}
