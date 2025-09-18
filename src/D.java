import java.util.ArrayList;
import java.util.Scanner;

public class D {
 public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
    System.out.println("Escriba un numero");
    String num = sc.nextLine();

    System.out.println("Escribe un digito"); 
    int digito = sc.nextInt();

    ArrayList<Integer> resultado = new ArrayList<Integer>();

    for (int i = 0; i < num.length(); i++) {
        char c = num.charAt(i);
        resultado.add(Integer.parseInt(Character.toString(c)));
    }

    for (int i = 0; i < resultado.size(); i++) {

        if(resultado.get(i) == digito){

            System.out.println("Numero en la posicion: " + i);

        }
        
    }

    






    }
}