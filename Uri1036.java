package Uri;

public class Uri1036
{

    public static void main(String[] args)
    {
        java.util.Scanner leia = new java.util.Scanner(System.in);
        double a = leia.nextDouble();
        double b = leia.nextDouble();
        double c = leia.nextDouble();
        double delta = (b * b) - 4 * a * c;
        if (delta < 0 || 2 * a == 0)
        {
            System.out.printf("Impossivel calcular\n");
        } else
        {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", x1, x2);
        }
    }

}
