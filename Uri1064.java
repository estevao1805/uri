package Uri;

public class Uri1064
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);
        float p = 0;
        int qnt = 0;

        for (int i = 1; i <= 6; i++)
        {
            float x = l.nextFloat();
            if (x > 0)
            {
                p += x;
                qnt++;
            }
        }
        System.out.printf("%d valores positivos\n", qnt);
        System.out.printf("%.1f\n", (p / qnt));
    }

}
