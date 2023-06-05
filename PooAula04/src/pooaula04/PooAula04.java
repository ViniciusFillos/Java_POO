
package pooaula04;

import java.util.Scanner;

public class PooAula04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caneta c1 = new Caneta("NIC", "AMARELA", 0.7f);
        c1.status();
        System.out.println("\nDigite o Modelo da caneta: ");
        String m = sc.nextLine();
        c1.setModel(m);        
        System.out.println("Digite o valor da ponta: ");
        float p = sc.nextFloat();
        c1.setPonta(p);
        System.out.println();
        c1.status();
    }
    
}
