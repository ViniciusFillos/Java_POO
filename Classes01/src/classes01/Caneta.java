
package classes01;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma Caneta " +this.cor);
        System.out.println("Tampada? "+this.tampada);
        System.out.println("Ponta de "+this.ponta);
        System.out.println("Carga de "+this.carga+"%");
        System.out.println("Modelo "+this.modelo);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO");
        } else{
            System.out.println("ESTOU RABISCANDO");
        }   
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
