/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author User
 */
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Metodos publicos
    public void marcarLuta(Lutador l1 , Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
           this. aprovada = true;
           this. desafiado =l2;
           this. desafiante = l1;
        }else{
           this. aprovada = false;
           this. desafiado  = null;
           this. desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("Desafiado");
           this. desafiado.apresentar();
            System.out.println("Desafiante");
                       this. desafiante.apresentar();
                       Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0 : 
                    System.out.println("Empate");
                    this.desafiado.empatar();
                    this.desafiante.empatar();
                    System.out.println("------------");
                    desafiante.status();
                    System.out.println("------------");
                    System.out.println("------------");
                    desafiado.status();
                    System.out.println("------------");
                    break;
                case 1 : 
                    System.out.println("-----------------------");
                    System.out.println("Vencedor ---- Desafiado");
                    System.out.println(this.desafiado.getNome());
                    this.desafiado.ganhar();
                    this.desafiante.perder();
                    System.out.println("Status actual");
                    desafiado.status();
                    break;
                case 2:
                    System.out.println("--------------------------");
                    System.out.println("Vencedor ---- Desafiante");
                    System.out.println(this.desafiante.getNome());
                    this.desafiado.perder();
                    this.desafiante.ganhar();
                    System.out.println("Status actual");
                    desafiante.status();
                    break;
            }
        }else{
            System.out.println("Erro! luta nao aprovada");
        }
        
    }
    //Metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
