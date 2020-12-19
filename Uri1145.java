package Uri;

public class Uri1145
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);

        int x = l.nextInt();
        int y = l.nextInt();

        int c = 1;
        int linha = 0;

        while (c <= y)
        {
            System.out.print(c);
            c++;
            linha++;
            if (linha < x)
            {
                System.out.print(" ");
            } else
            {
                System.out.println("");
                linha = 0;
            }

        }
    }

}
