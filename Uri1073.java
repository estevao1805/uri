package Uri;

public class Uri1073
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int x = l.nextInt();
        for (int i = 2; i <= x; i += 2)
        {
            System.out.printf("%d^2 = %d\n", i, i * i);
        }
    }

}
