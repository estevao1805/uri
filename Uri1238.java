package Uri;

public class Uri1238 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        
        int n = l.nextInt();
        l.nextLine();
        for(int i = 1; i <= n;i++){
            String a = l.nextLine();
            String b = l.nextLine();           
            String r = "";
            String maior = a.length()>b.length()?a:b;
            
            for(int j = 0;j < maior.length();j++){
                try{
                    r += a.charAt(j);
                    r += b.charAt(j);
                }catch(java.lang.StringIndexOutOfBoundsException e){
                    r += maior.substring(j,maior.length());
                    break;
                }
            }
            System.out.println(r);
        }
        
    }
    
}
