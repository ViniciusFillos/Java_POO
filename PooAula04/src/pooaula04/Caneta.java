
package pooaula04;
public class Caneta {
    private String model;
    private float ponta;
    private boolean tampa;
    private String cor;
    //ALT+INSERT
    public Caneta(String model, String cor, float ponta) {
        this.model = model;
        this.ponta = ponta;
        this.cor = cor;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String m){
        model = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        ponta = p;
    }
    public void tampar(){
        this.tampa = true;
    }
    public void status(){
        System.out.println("Modelo: "+this.getModel());
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampa);
    }
}
