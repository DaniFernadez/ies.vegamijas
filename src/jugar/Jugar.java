package jugar;

public class Jugar {
public static void main(String[] args) {
    
    Operacion opSuma = (x, y) -> x + y;
    System.out.println(opSuma.operacion(1,2));

}
}
