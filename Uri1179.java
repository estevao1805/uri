package Uri;

public class Uri1179 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        int pares[] = new int[5];
        byte currentPar = 0;
        int impares[] = new int[5];
        byte currentImpar = 0;
        
        for (int i = 1; i <= 15; i++) {
           int n = l.nextInt();
           
           if (n%2==0){
               pares[currentPar] = n;
               currentPar++;
               if(currentPar >= 5){
                   mostraVetor(pares, "");
                   currentPar = 0;
                   pares = new int[5];
               }
           }else{
               impares[currentImpar] = n;
               currentImpar++;
               if(currentImpar >= 5){
                   mostraVetor(impares, "im");
                   currentImpar = 0;
                   impares = new int[5];
               }
           }
        }
        mostraVetor(impares, "im");
        mostraVetor(pares, "");
    }
    
    public static void mostraVetor(int v[],String p){
        String x = p + "par";
        for(int i = 0;i < v.length;i++){
            if(v[i] != 0){
                System.out.printf("%s[%d] = %d\n",x,i,v[i]);
            }
            
        }
    }
}
