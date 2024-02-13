/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;

/**
 *
 * @author User
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta a = new Conta(false);
        
//        a.depositar(50);
//        a.mes();
//        a.s();
          a.setDono("Amilton Joao Miquitaio");
          a.setNumConta(122345666);
          a.setTipo("cc");
          a.abrirConta();
          a.mes();
          a.depositar(1000);
          a.getSaldo();
          
         // a.depositar(10);
         // a.setTipo("cp");
         // a.mes();
         //a.s();
         
          
        
    }
    
}
