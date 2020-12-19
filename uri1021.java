package Uri;

public class uri1021 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        
        double notas[] = {100.00,50.00,20.00,10.00,5.00,2.00};
        double moedas[] = {1.00,0.50,0.25,0.10,0.05,0.009};
        double valor = l.nextDouble();
        
        System.out.println("NOTAS:");
        for(int i = 0;i < notas.length;i++){
            System.out.printf("%.0f nota(s) de R$ %.2f\n",(valor-(valor%notas[i]))/notas[i],notas[i]);
            valor %= notas[i];
        }
        
        System.out.println("MOEDAS:");
        for(int i=0;i < moedas.length;i++){
            System.out.printf("%.0f moeda(s) de R$ %.2f\n",(valor-(valor%moedas[i]))/moedas[i],moedas[i]);
            valor %= moedas[i];
        }
        
    }
    
}
