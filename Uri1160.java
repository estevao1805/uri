package Uri;

import javax.swing.JOptionPane;

public class Uri1160 {

    public static void main(String args[]) {
        java.util.Scanner l = new java.util.Scanner(System.in);

        int a = l.nextInt();
        int b = l.nextInt();

        double crescimentoA = l.nextDouble();
        double crescimentoB = l.nextDouble();

        int anos = 0;

        while (b > a) {
            a += (int) a * (crescimentoA / 100);
            b += (int) b * (crescimentoB / 100);

            anos++;
        }

        System.out.println(anos);
        JOptionPane.showMessageDialog(null, "eu quero q essa porra funcione");
    }

}
