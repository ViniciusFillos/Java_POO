
package pooaula11;

public class Tecnico extends Pessoa{
    
    private int regitro;

    public int getRegitro() {
        return regitro;
    }

    public final void setRegitro(int regitro) {
        this.regitro = regitro;
    }
    
    public final void praticar(){
        System.out.println("Praticando... ");
    }
}
