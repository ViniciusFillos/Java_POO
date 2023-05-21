
package classes01;

public class Classes01 {


    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        c1.ponta = 0.7f;
        c1.cor = "azul";
        c1.tampada = false;
        c1.modelo = "bic";
        c1.carga = 80;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        c2.cor = "preta";
        c2.ponta = 1.0f;
        c2.carga = 90;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
