/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica01;

/**
 *
 * @author User
 */
public class Telefone implements Celular{
    private boolean tirarft;
    private boolean mandarsms;
    private boolean ligar;
    private boolean galeria;

    public Telefone() {
        this.setGaleria(false);
        this.setLigar(false);
        this.setMandarsms(false);
        this.setTirarft(false);
        
    }

    private boolean isTirarft() {
        return tirarft;
    }

    private void setTirarft(boolean tirarft) {
        this.tirarft = tirarft;
    }

    private boolean isMandarsms() {
        return mandarsms;
    }

    private void setMandarsms(boolean mandarsms) {
        this.mandarsms = mandarsms;
    }

    private boolean isLigar() {
        return ligar;
    }

    private void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    private boolean isGaleria() {
        return galeria;
    }

    private void setGaleria(boolean galeria) {
        this.galeria = galeria;
    }

    @Override
    public void galeria() {
        this.setGaleria(true);
    }

    @Override
    public void camera() {
        this.setTirarft(true);
    }

    @Override
    public void ligar() {
        this.setLigar(true);
    }

    @Override
    public void menssagem() {
        this.setMandarsms(true);
    }
    public void s(){
        System.out.println("Galeria: "+this.isGaleria());
        System.out.println("Em comunicacao? "+this.isLigar());
        System.out.println("Mandando Menssagem? "+this.isMandarsms());
        System.out.println("Tirando foto? "+this.isTirarft());
    }
    
    
    
    
}
