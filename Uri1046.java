package Uri;

public class Uri1046
{

    public static void main(String[] args)
    {
        java.util.Scanner leia = new java.util.Scanner(System.in);
        int inicio = leia.nextInt();
        int fim = leia.nextInt();
        if (fim <= inicio)
        {
            int tempo = 24 - (inicio - fim);
            System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
        } else
        {
            int tempo = fim - inicio;
            System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
        }
    }

}
