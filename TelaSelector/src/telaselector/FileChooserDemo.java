/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telaselector;
import javax.swing.*;
import java.io.File;

public class FileChooserDemo {
    public static void main(String[] args) {
        // Cria um seletor de arquivos
        JFileChooser fileChooser = new JFileChooser();

        // Mostra a janela de seleção de arquivos
        int option = fileChooser.showOpenDialog(null);

        // Se o usuário selecionou um arquivo
        if (option == JFileChooser.APPROVE_OPTION) {
            // Obtém o arquivo selecionado
            File file = fileChooser.getSelectedFile();

            // Exibe o caminho do arquivo e o nome do arquivo em uma janela de diálogo
            JOptionPane.showMessageDialog(null, "Caminho do arquivo: " + file.getPath() + "\nNome do arquivo: " + file.getName());
        }
    }
}

