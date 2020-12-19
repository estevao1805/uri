package Uri;

public class Uri1120
{

    public static void main(String args[])
    {
        java.util.Scanner l = new java.util.Scanner(System.in);

        while (true)
        {
            String d = l.nextLine();
            String valor = l.nextLine();
            String result = "0";

            if (d.equals("0") && d.equals(valor))
            {
                break;
            }

            for (int i = 0; i < valor.length(); i++)
            {
                char c = valor.charAt(i);

                if (!d.equals(c + ""))
                {
                    result += c;
                }
            }

            long r = Long.parseLong(result);
            System.out.println(r);

        }

    }
}
