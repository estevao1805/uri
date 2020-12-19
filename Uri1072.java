package Uri;

public class Uri1072
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int y = l.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 1; i <= y; i++)
        {
            int x = l.nextInt();
            if (x >= 10 && x <= 20)
            {
                in++;
            } else
            {
                out++;
            }
        }
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
    }
}
