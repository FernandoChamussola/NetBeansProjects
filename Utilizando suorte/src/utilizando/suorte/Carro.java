/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilizando.suorte;

/**
 *
 * @author User
 */
public class Carro {
    private boolean andar;
    private int velocidade;
    private int travar;
    private boolean lampada;
    private boolean ligado;
    private boolean retaguarda;
    private String marca;
    private String dono;
    private String cor;

    public Carro(String m , String d, String c) {
        this.marca = m;
        this.dono = d;
        this.cor = c;
    }

    public boolean getAndar() {
        return andar;
    }

    public void setAndar(boolean andar) {
        this.andar = andar;
        this.velocidade = 50;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setAcelerar(int acelerar) {
         velocidade += acelerar;
    }

    public int getTravar() {
        return travar;
    }

    public void setTravar(int travar) {
        if(this.getVelocidade() <= travar){
            velocidade = 0;
        }else{
            velocidade -= travar;
        }
    }

    public boolean getLampada() {
        return lampada;
    }

    public void setLampada(boolean lampada) {
        this.lampada = lampada;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getRetaguarda() {
        return retaguarda;
    }

    public void setRetaguarda(boolean retaguarda) {
        this.retaguarda = retaguarda;
    }

    @Override
    public String toString() {
        return "Carro{" + "andar=" + andar + ", velocidade=" + velocidade + ", travar=" + travar + ", lampada=" + lampada + ", ligado=" + ligado + ", retaguarda=" + retaguarda + ", marca=" + marca + ", dono=" + dono + ", cor=" + cor + '}';
    }

   
    
    
    
    
}
