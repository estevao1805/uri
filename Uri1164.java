package Uri;

public class Uri1164 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        
        int qnt = l.nextInt();
        for (int i = 0; i < qnt; i++) {
            int n = l.nextInt();
            int soma = 0;
            for(int j = 1; j <= (int)n/2;j++){
                if((float)n/j == (float)(n/j)-(n%j)){
                    soma+=j;
                }
            }
            if(n == soma){
                System.out.printf("%d eh perfeito\n",n); 
            }else{
                System.out.printf("%d nao eh perfeito\n",n);
            }
        }
    }
    
}
