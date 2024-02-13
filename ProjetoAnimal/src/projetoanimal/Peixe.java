/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoanimal;

/**
 *
 * @author User
 */
public class Peixe extends Animal {
    private String corEscama;
    
    
    public void SoltarBolha(){
        System.out.println("soltando bolhas");
    }

    @Override
    protected void locomover() {
        System.out.println("Nadando");
    }

    @Override
    protected void alimentar() {
        System.out.println("comendo substancia");
    }

    @Override
    protected void emitirSom() {
        System.out.println("blu blu blu");
    }
    
    
}
