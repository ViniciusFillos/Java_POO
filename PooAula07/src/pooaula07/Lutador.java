
package pooaula07;
public class Lutador {
    
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso()<52.2){
            this.categoria="Inválido";
        } else if(this.getPeso()<=70.3){
            this.categoria="Leve";
        } else if(this.peso<=83.9){
            this.categoria="Médio";
        } else if(this.getPeso()<=120.2){
            this.categoria="Pesado";
        } else{
            this.categoria="Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    public void apresentar(){
        System.out.println("Apresentamos o lutador "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("com "+this.getIdade()+" anos "+" e "+this.getAltura()+" m. de altura");
        System.out.println("Pesando "+this.getPeso()+" kg");
        System.out.println("Com "+this.getVitorias()+" vitórias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" Empates");
        System.out.println("-----------------------------------");

    }
    
    public void status(){
        System.out.println(this.getNome()+" é um peso "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" vezes");
        System.out.println("Perdeu "+this.getDerrotas()+" vezes");
        System.out.println("Empatou "+this.getEmpates()+" vezes");
        System.out.println("-----------------------------------");
        
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
}
