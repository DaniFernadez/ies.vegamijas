package inputs;

import java.io.BufferedReader;
import java.io.FileReader;

public class LecutraReader {
 public static void main(String[] args) {
    try {

          // Crea un FileReader 
          FileReader file = new FileReader("/home/dani/DAW/Entorno de Servidor/Proyectos/inicial/ies.vegamijas/input.txt");

          // Wrapeas (envuelves) el FileReader en un BufferedReader
          BufferedReader input = new BufferedReader(file);

          // Lees el primer caracter
          int i = input.read();

          while (i != -1) {
             System.out.print((char) i);

             // Lee el siguiente caracter
             i = input.read();
          }
          input.close();

       } catch (Exception e) {
          e.printStackTrace();
       }

 }   
}
