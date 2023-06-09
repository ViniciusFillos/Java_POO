
package pooaula10;

public class PooAula10 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Joao");
        p2.setNome("Maria");
        p3.setNome("Pedro");
        p4.setNome("Paulo");
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("M");
        
        p1.setIdade(27);
        p2.setIdade(16);
        p3.setIdade(18);
        p4.setIdade(23);
        
        p2.setCurso("ADS");
        p3.setSalario(5000);
        p4.setTrabalhando(true);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
    
}
