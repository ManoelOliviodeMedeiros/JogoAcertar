/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcertarNumero;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Manoel Olivio de Medeiros
 */
public class Musica {
    
     public static void playSound() {
    try {
        File arquivo = new File("C:/acertou2.wav");
        
        if (arquivo.isFile()){
            arquivo = arquivo;
        }
        
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(arquivo.getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
    }
        public static void playErrou() {
    try {
        File arquivo = new File("C:/errou.wav");
        
        if (arquivo.isFile()){
            arquivo = arquivo;
        }
        
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(arquivo.getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
    }
        public static void playErrou2() {
    try {
        File arquivo = new File("C:/errou2.wav");
        
        if (arquivo.isFile()){
            arquivo = arquivo;
        }
        
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(arquivo.getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
    }    
}
