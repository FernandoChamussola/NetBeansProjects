/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04gettersesetters;

/**
 *
 * @author User
 */
public class Aula04GettersEsetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.setModelo("bic");
        c1.setPonta(0.7f);
//        String m = c1.getModelo();
//        System.out.println(m);aqui mostra como funciona o metodo getters
c1.setModelo("ola");
c1.setPonta(0.5f);
        System.out.println(c1.getModelo());
        System.out.println(c1.getPonta());
    }
    
}
