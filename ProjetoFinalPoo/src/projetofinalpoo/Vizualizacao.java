/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinalpoo;

/**
 *
 * @author User
 */
public class Vizualizacao {
    private Gafanhoto espectador;
    private Vidio Filme;

    public Vizualizacao(Gafanhoto espectador, Vidio Filme) {
        this.espectador = espectador;
        this.Filme = Filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.Filme.setViews(this.Filme.getViews() +1);
        
    }
    public void avaliar(){
        this.Filme.setAvaliacao(5);
        
        
        
    }
     public void avaliar(int nota){
         this.Filme.setAvaliacao(nota);
        
    }
      public void avaliar(float p){
          int tot;
          if(p <= 20){
              tot = 3;
          }else if (p<=50){
              tot=5;
          }else if(p<=90){
              tot=8;
          }else{
              tot=10;
        this.Filme.setAvaliacao(tot);
    }
         
}

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Vidio getFilme() {
        return Filme;
    }

    public void setFilme(Vidio Filme) {
        this.Filme = Filme;
    }

    @Override
    public String toString() {
        return "Vizualizacao{" + "espectador=" + espectador + ", Filme=" + Filme + '}';
    }
    
}
