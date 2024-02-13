/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoanimal;

/**
 *
 * @author User
 */
public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }
        
    

    @Override
    protected void locomover() {
        System.out.println("Voando");
    }

    @Override
    protected void alimentar() {
        System.out.println("Comendo farelo");
    }

    @Override
    protected void emitirSom() {
        System.out.println("som de ave");
    }
    
}
