
package pooaula04;

import java.util.Scanner;

public class PooAula04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caneta c1 = new Caneta();
        
        System.out.println("Digite o Modelo da caneta: ");
        String m = sc.nextLine();
        c1.setModel(m);
        System.out.println("O modelo da Caneta é "+c1.getModel());
        
        System.out.println("Digite o valor da ponta: ");
        float p = sc.nextFloat();
        c1.setPonta(p);
        System.out.println("O tamanho da ponta é "+c1.getPonta());
        
        System.out.println("\n\n\n");
        c1.status();
    }
    
}
