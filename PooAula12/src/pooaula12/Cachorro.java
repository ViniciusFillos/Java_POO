
package pooaula12;

public class Cachorro extends Mamifero{
    
    public void abanarRabo(){
        System.out.println("Abanando rabo...");
    }
    public void enterrarOsso(){
        System.out.println("Enterrando osso...");
    }
    @Override
    public void emitirSom(){
        System.out.println("Au... Au... Au...");
    }
}
