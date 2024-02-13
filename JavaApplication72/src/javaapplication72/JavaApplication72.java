/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication72;

//import java.io.File;
//import javax.swing.JFileChooser;
//import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class JavaApplication72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        // Cria um seletor de arquivos
//        JFileChooser fileChooser = new JFileChooser();
//
//        // Mostra a janela de seleção de arquivos
//        int option = fileChooser.showOpenDialog(null);
//        
//         if (option == JFileChooser.APPROVE_OPTION) {
//            // Obtém o arquivo selecionado
//            
//           // File file = fileChooser.getSelectedFile();
        int a[] = {1,2};
        
        for( int b : a){
            b += b;  
            System.out.println(b);
                      
        }
        
    }
    
}
