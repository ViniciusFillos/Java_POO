
package pooaula09;


public class PooAula09 {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Joao", "masculino", 19);
        Livro l = new Livro("Pequeno Princípe", "Saint Exupery", 220, 0, false, p);
        l.detalhes();
        l.avancarPag();
        l.folear();
        l.abrir();
        l.folear();
        l.detalhes();
        
    }
    
}
