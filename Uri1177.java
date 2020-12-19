package Uri;

public class Uri1177
{

    public static void main(String args[])
    {
        java.util.Scanner l = new java.util.Scanner(System.in);

        int x = l.nextInt();

        int pos = 0;

        int vetor[] = new int[1000];

        for (int i = 0; i < vetor.length; i++)
        {
            vetor[i] = pos;
            pos++;
            pos %= x;
        }

        for (int i = 0; i < vetor.length; i++)
        {
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
    }
}
