
package pooaula13;

public class PooAula13 {

    public static void main(String[] args) {
        
        Cachorro d = new Cachorro();
        Lobo w = new Lobo();
        Mamifero m = new Mamifero();
        
        m.emitirSom();
        w.emitirSom();
        d.emitirSom();
        
        d.reagir("Olá");
        d.reagir("Vai Apanhar!");
        d.reagir(11, 45);
        d.reagir(21, 0);
        d.reagir(true);
        d.reagir(false);
        d.reagir(2, 12.5f);
        d.reagir(17,4.5f);
    }
    
}
