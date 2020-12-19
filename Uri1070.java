package Uri;

public class Uri1070
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int x = l.nextInt();
        for (int i = 1; i <= 6; i++)
        {
            if (x % 2 == 0)
            {
                x++;
            } else
            {
                x += 2;
            }
            System.out.println(x);
        }
    }

}
