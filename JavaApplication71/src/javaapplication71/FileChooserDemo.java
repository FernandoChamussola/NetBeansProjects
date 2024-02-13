/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication71;
import javax.swing.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

            // Lê o conteúdo do arquivo
            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Exibe o conteúdo do arquivo em uma janela de diálogo
            JOptionPane.showMessageDialog(null, content.toString());
        }
    }
}

