package inputs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class LecturaInputStream {
 public static void main(String[] args) {
     try {

            // Crea un FileInputStream 
            FileInputStream file = new FileInputStream("/home/dani/DAW/Entorno de Servidor/Proyectos/inicial/ies.vegamijas/input.txt");

                      
            // Wrapeas (envuelves) el FileInputStream en un BufferedInputStream
            BufferedInputStream input = new BufferedInputStream(file);

            // Lees el primer byte
            int i = input .read();

            while (i != -1) {
                System.out.print((char) i);

                // Lee el siguiente byte
                i = input.read();
            }
            input.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

 }   
}