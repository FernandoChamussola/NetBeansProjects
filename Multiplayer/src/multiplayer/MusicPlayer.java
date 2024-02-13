/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplayer;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class MusicPlayer {
    public static void main(String[] args) {
        // Cria um seletor de arquivos
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileChooser.showOpenDialog(null);
        if(option == JFileChooser.APPROVE_OPTION){
            File folder = fileChooser.getSelectedFile();
            File[] listOfFiles = folder.listFiles();

            for (File file : listOfFiles) {
                if (file.isFile() && (file.getName().endsWith(".wav") || file.getName().endsWith(".mp3"))) {
                    try {
                        // Abre um fluxo de áudio do arquivo de música
                        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

                        // Obtém o formato de áudio do fluxo de áudio
                        AudioFormat format = audioStream.getFormat();

                        // Obtém uma linha de dados que pode ser usada para reproduzir o clipe de áudio
                        DataLine.Info info = new DataLine.Info(Clip.class, format);

                        // Obtém um clipe de áudio e carrega o clipe de áudio do fluxo de áudio
                        Clip audioClip = (Clip) AudioSystem.getLine(info);
                        audioClip.open(audioStream);

                        // Inicia a reprodução do clipe de áudio
                        audioClip.start();

                        // Aguarda o clipe de áudio terminar de tocar
                        while (audioClip.isRunning()) {
                            Thread.sleep(1000);
                        }

                        // Fecha o clipe de áudio
                        audioClip.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }
}

