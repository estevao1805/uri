package Uri;

public class Uri1168
{

    public static void main(String[] args)
    {
        java.util.Scanner leia = new java.util.Scanner(System.in);
        int qnt = leia.nextInt();
        leia.nextLine();
        int led = 0;
        for (int u = 1; u <= qnt; u++)
        {
            String x = leia.nextLine();

            for (int i = 0; i < x.length(); i++)
            {
                char y;
                y = x.charAt(i);
                switch (y)
                {
                    case '1':
                        led += 2;
                        break;
                    case '2':
                    case '5':
                    case '3':
                        led += 5;
                        break;
                    case '4':
                        led += 4;
                        break;
                    case '6':
                    case '0':
                    case '9':
                        led += 6;
                        break;
                    case '7':
                        led += 3;
                        break;
                    case '8':
                        led += 7;
                        break;

                }
            }
            System.out.printf("%d leds\n", led);
            led = 0;
        }
    }
}
