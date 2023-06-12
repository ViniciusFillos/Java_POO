
package pooaula12;

public class Peixe extends Animal{
    
    protected String corEscama;
    
    public void soltarBolhas(){
        System.out.println("Soltando Bolhas...");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo algas...");
    }
    @Override
    public void locomover(){
        System.out.println("Nadando...");
    }
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som...");
    }
}
