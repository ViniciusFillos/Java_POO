
package pooaula14;

public class Gafanhoto extends Pessoa{
    
    private String login;
    private int totWatched;

    public Gafanhoto(String name, String gender, int age, String login) {
        super(name, gender, age);
        this.login = login;
        this.totWatched = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotWatched() {
        return totWatched;
    }

    public void setTotWatched(int totWatched) {
        this.totWatched = totWatched;
    }
    
    public void WhatcedMoreOne(){
        this.setTotWatched(this.getTotWatched()+1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +super.toString()+ "login=" + login + ", totWatched=" + totWatched + '}';
    }
    
}
