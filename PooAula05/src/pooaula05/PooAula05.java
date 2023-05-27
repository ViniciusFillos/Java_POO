
package pooaula05;

import java.util.Scanner;

public class PooAula05 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        ContaBanco c1 = new ContaBanco();
        ContaBanco c2 = new ContaBanco();
        
        
        c1.AbrirConta();
        c1.Depositar();
        c1.review();
        c1.PagarMensal();
        c1.review();
        
        System.out.println("Qual valor deseja sacar? ");
        c1.Sacar(sc.nextFloat());
        
        
        c1.FecharConta();
        c1.review();
        
    }
    
}
