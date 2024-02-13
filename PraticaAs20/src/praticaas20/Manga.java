/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticaas20;

/**
 *
 * @author User
 */
public class Manga {
    String cor;
    boolean doce;
    boolean podre;
    boolean madura;
    int preco;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isDoce() {
        return doce;
    }

    public void setDoce(boolean doce) {
        this.doce = doce;
    }

    public boolean isPodre() {
        return podre;
    }

    public void setPodre(boolean podre) {
        this.podre = podre;
    }

    public boolean isMadura() {
        return madura;
    }

    public void setMadura(boolean madura) {
        this.madura = madura;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    public void status(){
        System.out.println("cor:" + cor);
        System.out.println("preco: " + preco);
        System.out.println("doce: " + doce);
        System.out.println("podre: " + podre);
        System.out.println("madura " + madura);
    }
    
    
    
}
