
package fazercompras;

public class Compras {
    
    String lugar;
    int valor;
    boolean estado;
    
    void status(){
        System.out.println("Voce pretende ir a/ao "+this.lugar);
        System.out.println("Voce tem R$"+this.valor+" para gastar");
    }
    void começar(){
        this.estado = true;
        System.out.println("Voce esta comprando agora");
    }
    void finalizar(){
        this.estado = false;
        System.out.println("Voce nao esta comprando agora");
    }
    void comprar(){
        if(this.estado == false){
            System.out.println("Voce não pode comprar agora");
        } else{
            System.out.println("Vou lembrar de comprar isso");
        }
    }
}
