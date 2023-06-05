
package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    void status(){
        System.out.println("Uma Caneta " +this.cor);
        System.out.println("Tampada? "+this.tampada);
        System.out.println("Ponta de "+this.ponta);
        System.out.println("Carga de "+this.carga+"%");
        System.out.println("Modelo "+this.modelo);
    }
    protected void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO");
        } else{
            System.out.println("ESTOU RABISCANDO");
        }   
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
