package Uri;


public class Uri1047 {
    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        
        int hi = l.nextInt();
        int mi = l.nextInt();
        int hf = l.nextInt();
        int mf = l.nextInt();
        
        int i = hi*60 + mi;
        int f = hf*60 + mf;
        
        int tempo = f - i;
        
        int horas = (int) tempo / 60;
        int minutos = tempo % 60;
        
        horas = horas <= 0 && minutos <= 0? 24: horas;
        
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", horas, minutos);
    }
}
