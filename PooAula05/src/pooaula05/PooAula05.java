
package pooaula05;

import java.util.Scanner;

public class PooAula05 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        ContaBanco c1 = new ContaBanco();
        
        c1.AbrirConta();
        c1.Depositar();
        
        System.out.println("Qual valor deseja sacar? ");
        float sac = sc.nextFloat();
        float valor = c1.Sacar(sac);
        System.out.println("Sua conta ficou com o valor de: "+ valor);
        
        c1.FecharConta();
    }
    
}
