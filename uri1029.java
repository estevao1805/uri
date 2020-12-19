package Uri;

public class uri1029 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        
        int qnt = l.nextInt();
        for (int i = 0; i < qnt; i++) {
            int n = l.nextInt();
            int v[] = {-1};
            int r = fib(n,v);
            System.out.printf("fib(%d) = %d calls = %d\n",n,v[0],r);
        }
    }
    
    public static int fib(int n,int v[]){
        v[0]++;
        switch(n){
            case 1:
                return 1;
            case 0:
                return 0;
            default:
                return fib(n-1,v) + fib(n-2,v);
        }  
    }
    
}
