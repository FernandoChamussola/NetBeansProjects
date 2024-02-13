/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classcoluna;

/**
 *
 * @author User
 */
public class CLassColuna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coluna c = new Coluna();
        c.setLigado(true);
        c.setBlu(false);
        c.setCarga(0);
        c.setDesligado(true);
        c.setLigado(false);
        c.setNtocar(true);
        c.setTocar(false);
        c.setTomada(false);
        c.status();
    }

}
