package Uri;

public class Uri1114 {

    public static void main(String[] args) {
        java.util.Scanner leia = new java.util.Scanner(System.in);
        int senha;
        while (true) {
            senha = leia.nextInt();

            if (senha == 2002) {
                System.out.print("Acesso Permitido\n");
                break;
            } else {
                System.out.print("Senha Invalida\n");
            }
        }
    }

}
