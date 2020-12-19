package Uri;

public class Uri1071
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int x = l.nextInt();
        int y = l.nextInt();
        int acm = 0;

        if (x < y)
        {
            if (x % 2 == 0)
            {
                x++;
                y -= 2;
                acm += x;
                while (x < y)
                {
                    x += 2;
                    acm += x;
                }
            } else
            {
                y -= 2;
                while (x < y)
                {
                    x += 2;
                    acm += x;
                }
            }
        } else if (y < x)
        {
            if (y % 2 == 0)
            {
                y++;
                x -= 2;
                acm += y;
                while (y < x)
                {
                    y += 2;
                    acm += y;
                }
            } else
            {
                x -= 2;
                while (y < x)
                {
                    y += 2;
                    acm += y;
                }

            }

        }
        System.out.println(acm);
    }

}
