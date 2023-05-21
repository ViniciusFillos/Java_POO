
package aula03;

public class Aula03 {

    
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.modelo = "BIC CRISTAL";
        c1.cor = "AZUL";
        //c1.ponta = 0.5f; ponta por ser privado da erro
        c1.carga = 50;
        //c1.tampada = false;
        c1.tampar();//mesmo o atributo tampada sendo privado, o metodo tampar é publico podendo modificar o estado do atributo
        c1.status();
        c1.rabiscar();

    }
    
}
