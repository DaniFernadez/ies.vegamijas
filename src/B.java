import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Precio producto: ");
        double precio = sc.nextDouble();

        System.out.println("tipo IVA: ");
        String iva = sc.nextLine();


        System.out.println("Tipo codigo promocional: ");
        String descuento = sc.nextLine();

        double ivaFinal = 0;
        String ivaa = "";

        double descuentoFinal = 0;
        String descuentoo = "";

        if(iva.equalsIgnoreCase("general")){
            ivaFinal = (precio * 0.21);
            ivaa = "21%";
        }else if (iva.equalsIgnoreCase("reducido")){
             ivaFinal = (precio * 0.10);
            ivaa = "10%";
        }else if (iva.equalsIgnoreCase("superreducido")){
              ivaFinal = (precio * 0.04);   
              ivaa = "4%";
        }else 
        
        System.out.println("tipo de iva desconocido");
      
        if(descuento.equalsIgnoreCase("nopro")){
            descuentoFinal = 0;
            descuentoo = "nopro";
        }else if (descuento.equalsIgnoreCase("mitad")){
            descuentoFinal = precio/2;
            descuentoo = "mitad";    
        }else if (descuento.equalsIgnoreCase("meno5")){
            descuentoFinal = 5;
            descuentoo = "menoo5";
        }else if(descuento.equalsIgnoreCase("5porc")){
            descuentoFinal = precio * 0.05;
            descuentoo = "5porc";
        }else 
        
        System.out.println("tipo de descuento desconocido");

       System.out.println("base imponible        " + precio); 
       System.out.println("IVA(" + ivaa + ")        " + ivaFinal );    
       System.out.println("PRecio con IVA        " + (precio+ ivaFinal));
       System.out.println("Cod.Promo.(" + descuentoo+")        -"+ descuentoo);
       System.out.println("TOTAL        " + ((precio + iva) - descuentoo));
    }
}
