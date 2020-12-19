package Uri;

public class Uri1115
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);

        int n = 0;

        int x, y;
        while (true)
        {
            x = l.nextInt();
            y = l.nextInt();

            if (x == 0 || y == 0)
            {
                break;
            } else if (x > 0 && y > 0)
            {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0)
            {
                System.out.println("segundo");
            } else if (x < 0 && y < 0)
            {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0)
            {
                System.out.println("quarto");
            }
        }
    }

}
