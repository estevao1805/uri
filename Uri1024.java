package Uri;

public class Uri1024
{

    public static void main(String[] args)
    {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int qnt = l.nextInt();
        l.nextLine();

        for (int t = 1; t <= qnt; t++)
        {
            String f = l.nextLine();

            //primeira passada
            String result = "";
            for (int i = 0; i < f.length(); i++)
            {
                char d = f.charAt(i);
                if ((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z'))
                {
                    d += 3;
                }
                result += d;
            }

            //segunda passada
            String result2 = "";
            for (int y = 0; y < result.length(); y++)
            {
                char d = result.charAt(y);
                result2 = d + result2;
            }

            //terceira passada
            String result3 = "";
            for (int x = 0; x < result2.length(); x++)
            {
                char d = result2.charAt(x);
                if (x >= result2.length() / 2)
                {
                    d -= 1;
                }
                result3 += d;
            }
            System.out.printf("%s\n", result3);

        }
    }

}
