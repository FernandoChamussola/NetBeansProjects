/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classcoluna;

/**
 *
 * @author User
 */
public class Coluna {
    boolean ligado;
    boolean desligado;
    boolean tocar;
    boolean Ntocar;
    boolean blu;
    int carga;
    boolean tomada;
    

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isDesligado() {
        return desligado;
    }

    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }

    public boolean isTocar() {
        return tocar;
    }

    public void setTocar(boolean tocar) {
        this.tocar = tocar;
    }

    public boolean isNtocar() {
        return Ntocar;
    }

    public void setNtocar(boolean Ntocar) {
        this.Ntocar = Ntocar;
    }

    public boolean isBlu() {
        return blu;
    }

    public void setBlu(boolean blu) {
        this.blu = blu;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTomada() {
        return tomada;
    }

    public void setTomada(boolean tomada) {
        this.tomada = tomada;
    }
    public void status(){
        System.out.println(isTomada());
        System.out.println(getCarga());
        System.out.println(isBlu());
        System.out.println(isNtocar());
        System.out.println(isDesligado());
        System.out.println(isLigado());
        
    }
    
    
    
}
