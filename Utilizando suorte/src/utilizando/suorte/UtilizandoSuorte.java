/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utilizando.suorte;

/**
 *
 * @author User
 */
public class UtilizandoSuorte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro c = new Carro("Ractis","Fernando","Vermelho");
        c.setAndar(true);
        c.setAcelerar(180);
        c.setTravar(100);
        System.out.println(c.toString());
        
    }
    
}
