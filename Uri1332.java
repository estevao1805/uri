package Uri;

public class Uri1332
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int qnt = l.nextInt();
        l.nextLine();
        for (int y = 1; y <= qnt; y++)
        {
            String n = l.nextLine();
            if (n.length() > 3)
            {
                System.out.println("3");
            } else
            {
                char l1 = n.charAt(0);
                char l2 = n.charAt(1);
                char l3 = n.charAt(2);

                if (n.equals("one") || l1 == 'o' && l2 == 'n' || l2 == 'n' && l3 == 'e' || l1 == 'o' && l3 == 'e')
                {
                    System.out.println("1");
                } else
                {
                    System.out.println("2");
                }
            }
        }
    }
}
