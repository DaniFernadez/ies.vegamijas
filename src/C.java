import java.util.ArrayList;
import java.util.Scanner;

public class C {
    public static void main(String[] args) throws Exception {
    
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        int contador = 0;
       
        for (int i = 1; i <= 100; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escriba un numero, para parar el programa escriba -1: ");
            int num = sc.nextInt();

            if (num == -1) {
                break;
            } else if (num % 2 != 0){
                impares.add(i);
                contador++;
            }else if (num % 2 == 0) {
                pares.add(i);
                contador++;
            }  
                
        }

        int mediaImpares = 0;
        int mayorPar = 0;

        for(int i = 0; i < impares.size(); i++){
            mediaImpares += impares.get(i); 
        }
        
        for (int i = 0; i < pares.size(); i++) {
            if (pares.get(i) >= mayorPar) {
                mayorPar = pares.get(i);
                
            }
        }
       
        System.out.println("cantidad numeros " + contador);
        System.out.println("Media de impares:" +mediaImpares/impares.size());
        System.out.println("Par mayor: " + mayorPar);
         
            
    }
}