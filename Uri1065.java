package Uri;

public class Uri1065
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int c = 0;
        for (int i = 1; i <= 5; i++)
        {
            int x = l.nextInt();
            if (x % 2 == 0)
            {
                c++;
            }
        }
        System.out.printf("%d valores pares\n", c);
    }
}
