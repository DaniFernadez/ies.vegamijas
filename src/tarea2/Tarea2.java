package tarea2;

import java.lang.classfile.Instruction;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tarea2 {

    private static Map<String, Interfaztarea2> mapOperacion = new HashMap<>();
public static void main(String[] args) {

    System.out.println("Introduce tipo operacion (sum, rest, mult, div) y posteriormente 2 digitos Ej: sum 23");
    
    Interfaztarea2 opSuma = (x, y) -> x + y;
    Interfaztarea2 opResta = (x, y) -> x - y;
    Interfaztarea2 opMult = (x, y) -> x * y;
    Interfaztarea2 opDiv = (x, y) -> x / y;
    
    mapOperacion.put("+", opSuma);
    mapOperacion.put("add", opSuma);

    mapOperacion.put("-", opResta);
    mapOperacion.put("sub", opResta);

    mapOperacion.put("*", opMult);
    mapOperacion.put("mul", opMult);

    mapOperacion.put("/", opDiv);
    mapOperacion.put("div", opDiv);

    String input ="";
        Scanner sc = new Scanner(System.in);
        while (!"exit".equalsIgnoreCase(input)) {

            input = sc.nextLine();
            String[] instruccion = input.trim().split(" ");

            if (instruccion.length != 3) {
                System.out.println("Formato de entrada " + input+ " incorrecto");
                
            }else{
                if (mapOperacion.keySet().contains(instruccion[0])) {
                    try{
                        Double.parseDouble(instruccion[1]);

                    }catch(NumberFormatException nfe){

                        System.out.println("Formato parametro " + instruccion[1] + " incorrecto");

                    }


                    }
                }
            }
        }



}

