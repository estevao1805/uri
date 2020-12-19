package Uri;

public class Uri1080
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int maior = -1, p = 0, c = 0;
        int n;

        for (int i = 1; i <= 100; i++)
        {
            n = l.nextInt();
            c++;
            if (n > maior)
            {
                maior = n;
                p = c;
            }
        }
        System.out.printf("%d\n%d\n", maior, p);
    }

}
