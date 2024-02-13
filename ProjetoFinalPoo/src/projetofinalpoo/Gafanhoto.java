/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinalpoo;

/**
 *
 * @author User
 */
public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo,String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }//o super diz que este construtor vem da superclasse
    
    public void viuMaisUm(){
        totAssistido++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    

   

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
    
    
}
