
package pooaula14;

public class PooAula14 {

    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Poo Aula 01");
        v[1] = new Video("Python Aula 02");
        v[2] = new Video("DB Aula 03");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", "maculino", 22, "xXxDARKxXx");
        g[1] = new Gafanhoto("Joana", "feminino", 55, "JoanaMariadaSilva");

        View w[] = new View[3];
        w[0] = new View(g[0], v[2]); //Jubileu assiste DB
        w[0].rating();
        w[1] = new View(g[0], v[1]); //Jubileu assiste Python
        w[1].rating(87.7f);
        System.out.println(w[0].toString());
        System.out.println(v[1].toString());
        
        
        /*for(int i=0; i<3; i++){
         *  System.out.println(v[i].toString());
         *}
         *  System.out.println(g[0].toString());
           System.out.println(g[1].toString());
         */
    }
    
}
