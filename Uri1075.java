package Uri;

public class Uri1075
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int x = l.nextInt();

        for (int i = 1; i <= 10000; i++)
        {
            if (i % x == 2)
            {
                System.out.println(i);
            }
        }
    }

}
