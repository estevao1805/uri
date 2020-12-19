package Uri;

public class Uri1132
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);

        int x = l.nextInt();
        int y = l.nextInt();
        int soma = 0;

        if (x > y)
        {
            for (; y <= x; y++)
            {
                if (y % 13 != 0)
                {
                    soma += y;
                }
            }
        } else
        {
            for (; x <= y; x++)
            {
                if (x % 13 != 0)
                {
                    soma += x;
                }
            }
        }

        System.out.printf("%d\n", soma);
    }

}
