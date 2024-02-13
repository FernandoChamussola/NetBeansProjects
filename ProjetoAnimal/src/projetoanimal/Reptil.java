/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoanimal;

/**
 *
 * @author User
 */
public class Reptil extends Animal {
    private String corScama;

    @Override
    protected void locomover() {
        System.out.println("Arrastar");
    }

    @Override
    protected void alimentar() {
        System.out.println("comendo restos de animais mortos");
    }

    @Override
    protected void emitirSom() {
        System.out.println("som de raptil");
    }

    public String getCorScama() {
        return corScama;
    }

    public void setCorScama(String corScama) {
        this.corScama = corScama;
    }
    
    
}
