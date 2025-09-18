import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota del primer examen");
        double nota1 = sc.nextDouble();
//f
        
        System.out.println("Nota del segundo examen");
        double nota2 = sc.nextDouble();
        sc.nextLine(); // Limpiar el buffer del scanner después de nextDouble()
        System.out.println(nota1);
        System.out.println(nota2);

        if (nota1 < 5 && nota2 < 5){
            System.out.println("Aprobaste la recuperacion? (apto/no apto)");
            String recuperacion = sc.nextLine();

            if (recuperacion.equalsIgnoreCase("apto")) {
                    
                System.out.println("tu nota de programacion es 5");
            }else{

                System.out.println("no apruebas");
            }

        }


        System.out.println("nota media:" + (nota1+nota2)/2 );



        

    }
}
