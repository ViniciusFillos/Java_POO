
package pooaula11;

public class PooAula11 {

    public static void main(String[] args) {
        
        //Pessoa é uma classe abstrata, logo nao pode ser instanciada e serve unicamente para ser progenitora...
        
       /*Visitante é uma classe com uma relaçao de herança pobre com Pessoa logo funciona como uma Pessoa instanciada...
        *Visitante vis = new Visitante();
        *vis.setIdade(15);
        *vis.setNome("João");
        *vis.setSexo("Masculino");
        */
       
       /*Aluno alem de herdar metodos e atributos de Pessoa, adiciona ainda mais, herança para diferença, professor funciona igual
        *Aluno al = new Aluno();
        *al.setMatricula(12345);
        *al.setCurso("Informática");
        *al.pagarMensal(); 
        */
       
        /*Bolsista é uma folha (poderia ser uma classe final ou ter metodos finais), tambem funciona como subclasse de Aluno e descendente de Pessoa, Tecnico funciona igual
        *Bolsista bol = new Bolsista();
        *bol.setBolsa(0.5f);//50% == 0,5
        *bol.renovarBolsa();
        *bol.pagarMensal();
        */
    }
    
}
