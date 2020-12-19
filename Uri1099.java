package Uri;

public class Uri1099 {
    
    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        
        int n = l.nextInt();
     
        for (int i = 1;i <= n; i++){
            int soma = 0;
            int x = l.nextInt();
            int y = l.nextInt();
            
            if (x > y){
                int aux = y;
                y = x;
                x = aux;
            }
            
            for(int j = x%2==0?x+1:x+2;j < y;j+=2){
                soma += j;
            }
            System.out.println(soma);
        }
    }  
}
