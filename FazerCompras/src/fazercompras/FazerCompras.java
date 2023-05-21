
package fazercompras;

public class FazerCompras {

    public static void main(String[] args) {
        
        Compras m1 = new Compras();
        Compras m2 = new Compras();
        
        m1.lugar = "mercado";
        m1.valor = 50;
        m1.estado = false;
        m1.status();
        m1.começar();
        m1.comprar();
        
        m2.lugar = "shopping";
        m2.valor = 15;
        m2.status();
        m2.finalizar();
        m2.comprar();
        
    }
    
}
