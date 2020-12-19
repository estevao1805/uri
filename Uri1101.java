package Uri;

public class Uri1101 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        
        while (true) {            
            int m = l.nextInt();
            int n = l.nextInt();
            
            if(0 == m || 0 == n){
                System.out.println("");
                break;
            }

            if(n<m){
                int ax = m;
                m = n;
                n = ax;
            }
            
            int soma = 0;
            
            for(int i = m;i <= n;i++){
                System.out.printf("%d ",i);
                soma+=i;
            }
            System.out.printf("Sum=%d\n",soma);
        }
    }
     
}
