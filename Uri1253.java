package Uri;

public class Uri1253 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        
        int qnt = l.nextInt();
        
        for(int i = 1;i <= qnt;i++){
            l.nextLine();
            String msg = l.nextLine();
            int n = l.nextInt();
            
            String r = "";
            
            for(int j = 0;j < msg.length();j++){
                char c = msg.charAt(j);
                
                if(c-n>='A'){
                    c -= n;
                }else{
                    c += 25-n;
                }
                
                r+=c;
            }
            System.out.println(r);
        }
    }
    
}
