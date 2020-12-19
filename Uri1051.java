package Uri;

import java.util.Scanner;

public class Uri1051 {

    public static void main(String[] args) {
        java.util.Scanner l = new java.util.Scanner(System.in);
        
        double salario = l.nextDouble();
        double imposto = 0;
        if(salario <= 2000.00 ){
            System.out.println("Isento");
        }else{
            if(salario >= 2000.01 && salario <= 3000.00){
                double i = salario - 2000.00;
                imposto += i*0.08;
            }else if(salario >= 3000.01 && salario <= 4500.00){
                double i = salario - 3000.00;
                imposto += i*0.18+1000.00*0.08;
            }else{
                double i = salario - 4500.01;
                imposto += i*0.28+1500.00*0.18+1000.00*0.08;
            }
            System.out.printf("R$ %.2f\n",imposto);
        }
        
    }
    
}
