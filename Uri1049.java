package Uri;

public class Uri1049
{

    public static void main(String[] args)
    {
        java.util.Scanner leia = new java.util.Scanner(System.in);
        String tipo1 = leia.nextLine();
        String tipo2 = leia.nextLine();
        String tipo3 = leia.nextLine();
        if ("vertebrado".equals(tipo1) && "ave".equals(tipo2) && "carnivoro".equals(tipo3))
        {
            System.out.println("aguia");
        } else if ("vertebrado".equals(tipo1) && "ave".equals(tipo2) && "onivoro".equals(tipo3))
        {
            System.out.println("pomba");

        } else if ("vertebrado".equals(tipo1) && "mamifero".equals(tipo2) && "onivoro".equals(tipo3))
        {
            System.out.println("homem");
        } else if ("vertebrado".equals(tipo1) && "mamifero".equals(tipo2) && "herbivoro".equals(tipo3))
        {
            System.out.println("vaca");
        } else if ("invertebrado".equals(tipo1) && "inseto".equals(tipo2) && "hematofago".equals(tipo3))
        {
            System.out.println("pulga");
        } else if ("invertebrado".equals(tipo1) && "inseto".equals(tipo2) && "herbivoro".equals(tipo3))
        {
            System.out.println("lagarta");
        } else if ("invertebrado".equals(tipo1) && "anelideo".equals(tipo2) && "hematofago".equals(tipo3))
        {
            System.out.println("sanguessuga");
        } else if ("invertebrado".equals(tipo1) && "anelideo".equals(tipo2) && "onivoro".equals(tipo3))
        {
            System.out.println("minhoca");
        }
    }

}
