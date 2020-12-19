package Uri;

public class Uri1235 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        
        int qnt = l.nextInt();
        l.nextLine();
        
        for(int i = 1;i <= qnt;i++){
            String n = l.nextLine();
            String r;
            String n1 = n.substring(0,n.length()/2);
            String n2 = n.substring((n.length()/2),n.length());
            
            r = inverteS(n1)+inverteS(n2);
            System.out.println(r);
        }
    }
    
    public static String inverteS(String n){
        String r = "";
        
        for(int i = n.length()-1;i >= 0;i--){
            r += n.charAt(i);
        }
        
        return r;
    }
    
}
