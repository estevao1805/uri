package Uri;

public class Uri1241
{

    public static void main(String args[])
    {

        java.util.Scanner l = new java.util.Scanner(System.in);

        int qnt = l.nextInt();
        l.nextLine();

        for (int d = 0; d < qnt; d++)
        {
            String a = l.nextLine();
            String b = l.nextLine();

            boolean x = true;

            for (int i = a.length() - 1, j = b.length() - 1; j >= 0; i--)
            {
                if (a.charAt(i) != b.charAt(j))
                {
                    x = false;
                    break;
                }
                j--;
            }

            if (x)
            {
                System.out.println("encaixa");
            } else
            {
                System.out.println("nao encaixa");
            }
        }

    }
}
