
package pooaula09;

import java.util.Random;

public class Livro implements Publicacao{
    
    private String titulo, autor;
    private int totPaginas,pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if(!this.isAberto()){
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()){
            this.setAberto(false);
        }
    }

    @Override
    public void folear() {
        if(this.isAberto()){
            Random aleatorio = new Random();
            this.setPagAtual(aleatorio.nextInt(this.getTotPaginas()));
            System.out.println("Você parou na página "+this.getPagAtual()+"\n");
        } else{
            System.out.println("Você não pode folear um livro fechado \n");
        }
    }

    @Override
    public void avancarPag() {
        if(this.isAberto() && this.getPagAtual()!= this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual()+1);
        } else{
            System.out.println("Não é possivel avançar a página \n");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto() && this.getPagAtual() != 0){
            this.setPagAtual(this.getPagAtual()-1);
        } else{
            System.out.println("Não há páginas anteriores a esta! \n");
        }
    }
    
    public void detalhes(){
        System.out.println("Livro "+this.getTitulo());
        System.out.println("Autor "+this.getAutor());
        System.out.println("Total de Páginas: "+this.getTotPaginas());
        System.out.println("Aberto: "+this.isAberto());
        System.out.println("Leitor: "+this.getLeitor().getNome());
        System.out.println("Página atual: "+this.getPagAtual());
        System.out.println("-----------------------------------");
    }
}
