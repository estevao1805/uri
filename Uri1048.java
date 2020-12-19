package Uri;

public class Uri1048
{

    public static void main(String[] args)
    {
        java.util.Scanner leia = new java.util.Scanner(System.in);
        float x = leia.nextFloat();
        if (x >= 0 && x <= 400.00)
        {
            System.out.printf("Novo salario: %.2f\n", (x * 1.15));
            System.out.printf("Reajuste ganho: %.2f\n", (x * 0.15));
            System.out.print("Em percentual: 15 %\n");
        } else if (x >= 400.01 && x <= 800.00)
        {
            System.out.printf("Novo salario: %.2f\n", (x * 1.12));
            System.out.printf("Reajuste ganho: %.2f\n", (x * 0.12));
            System.out.print("Em percentual: 12 %\n");
        } else if (x >= 800.01 && x <= 1200.00)
        {
            System.out.printf("Novo salario: %.2f\n", (x * 1.10));
            System.out.printf("Reajuste ganho: %.2f\n", (x * 0.10));
            System.out.print("Em percentual: 10 %\n");
        } else if (x >= 1200.01 && x <= 2000.00)
        {
            System.out.printf("Novo salario: %.2f\n", (x * 1.07));
            System.out.printf("Reajuste ganho: %.2f\n", (x * 0.07));
            System.out.print("Em percentual: 7 %\n");
        } else
        {
            System.out.printf("Novo salario: %.2f\n", (x * 1.04));
            System.out.printf("Reajuste ganho: %.2f\n", (x * 0.04));
            System.out.print("Em percentual: 4 %\n");
        }

    }

}
