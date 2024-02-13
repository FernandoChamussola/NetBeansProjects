/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticandoclasses;

/**
 *
 * @author User
 */
public class Pc {
    boolean tela_acesa;
    int carga;
    boolean conectado;
    String tirarft;
    boolean blu;
    boolean digitar;
    
//    void acender_tela(){
//        tela_acesa = true;
//        
//    }
//    void desligar_tela(){
//        tela_acesa = false;
//    }
//    void ligar_carregador(){
//        conectado = true;
//        
//    }
//    void tirardacarga(){
//        conectado = false;
//    }
//    void tirarfoto(){
//        if(this.carga < 10){
//            System.out.println("pouca bateria");
//        }else if(this.conectado == true & this.carga < 10){
//            System.out.println("faz uma pose");
//        }
//        else{
//            System.out.println("faz uma pose");
//        }
//    }
//    void ligarblu(){
//        blu = true;
//    }
//    void desliblu(){
//        blu = false;
//    }
//    void digitarr(){
//        if(this.carga < 15){
//            digitar = false;
//            System.out.println("nao podes digitar um documento");
//        }else{
//            digitar = true;
//            System.out.println("digite");
//        }
//           
//    }
//    void status(){
//        System.out.println("a tela esta acesa? " + this.tela_acesa);
//        System.out.println("o carregador esta ligado? " + this.conectado);
//        System.out.println("o blu.. esta ligado? " + this.blu);
//        System.out.println("posso digitar? " + this.digitar);
//        
//    }

    public boolean isTela_acesa() {
        return tela_acesa;
    }

    public void setTela_acesa(boolean tela_acesa) {
        this.tela_acesa = tela_acesa;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public String getTirarft() {
        return tirarft;
    }

    public void setTirarft(String tirarft) {
        this.tirarft = tirarft;
    }

    public boolean isBlu() {
        return blu;
    }

    public void setBlu(boolean blu) {
        this.blu = blu;
    }

    public boolean isDigitar() {
        return digitar;
    }

    public void setDigitar(boolean digitar) {
        this.digitar = digitar;
    }
    public boolean bluu(){
        return blu;
    }
    
    
    
}
