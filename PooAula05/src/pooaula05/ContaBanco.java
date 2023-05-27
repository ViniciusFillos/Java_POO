
package pooaula05;

import java.util.Scanner;

public class ContaBanco {
    Scanner sc = new Scanner(System.in);
    int contas=0;
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String  getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void AbrirConta(){
        System.out.println("Voce deseja abrir uma conta?(s/n) ");
        String res = sc.next();
        if(res.equals("s")){
            contas++;
            this.setStatus(true);
            this.setNumConta(contas);
            
            System.out.println("Qual o nome do dono da conta?");
            String nome = sc.next();
            this.setDono(nome);
            
            System.out.println("Que tipo de conta voce deseja abrir?(CC/CP)");
            String res2 = sc.next();
            if(res2.equals("CC")){
                this.setTipo("CC");
                this.setSaldo(50);
            } else{
                this.setTipo("CP");
                this.setSaldo(150);
            }
        }
    }
    
    public void FecharConta(){
        if(this.saldo==0){
            this.setStatus(false);
            this.setDono("");
            this.setNumConta(0);
            System.out.println("Sua conta foi encerrada!");
            contas--;
        } else{
            System.out.println("Voce não pode finalizar o processo tendo um valor em sua conta");
        }
    }
    
    public void Depositar(){
        System.out.println("Qual valor deseja depositar? ");
        this.setSaldo(this.saldo+sc.nextFloat());
        System.out.println("Sua conta ficou com o valor de "+this.getSaldo());
    }
    
    public float Sacar(float valor){

        if(this.saldo-valor<0){
            System.out.println("Voce nao tem esse valor para sacar.");
        } else{
            this.setSaldo(this.saldo-valor);
        }
        return this.saldo;
    }
    
    public void PagarMensal(){
        if(this.tipo.equals("CC")){
            this.setSaldo(this.saldo-12);
            System.out.println("Sua conta ficou com o valor de "+this.getSaldo());
        } else{
            this.setSaldo(this.saldo-20);
            System.out.println("Sua conta ficou com o valor de "+this.getSaldo());
        }
    }
}
