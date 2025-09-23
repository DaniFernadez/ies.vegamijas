import java.util.Scanner;

public class F2 {
 public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la posición del alfil (ejemplo d4): ");
        String pos = sc.nextLine().trim().toLowerCase();

        String result = "";
        switch (pos) {
            case "a1": result = "b2 c3 d4 e5 f6 g7 h8"; break;
            case "a2": result = "b1 b3 c4 d5 e6 f7 g8"; break;
            case "a3": result = "b2 b4 c1 c5 d6 e7 f8"; break;
            case "a4": result = "b3 b5 c2 c6 d1 d7 e8"; break;
            case "a5": result = "b4 b6 c3 c7 d2 d8"; break;
            case "a6": result = "b5 b7 c4 c8 d3"; break;
            case "a7": result = "b6 b8 c5 d4 e3 f2 g1"; break;
            case "a8": result = "b7 c6 d5 e4 f3 g2 h1"; break;
            case "b1": result = "a2 c2 d3 e4 f5 g6 h7"; break;
            case "b2": result = "a1 a3 c1 c3 d4 e5 f6 g7 h8"; break;
            case "b3": result = "a2 a4 c2 c4 d1 d5 e6 f7 g8"; break;
            case "b4": result = "a3 a5 c3 c5 d2 d6 e1 e7 f8"; break;
            case "b5": result = "a4 a6 c4 c6 d3 d7 e2 e8"; break;
            case "b6": result = "a5 a7 c5 c7 d4 d8 e3"; break;
            case "b7": result = "a6 a8 c6 c8 d5 e4 f3 g2 h1"; break;
            case "b8": result = "a7 c7 d6 e5 f4 g3 h2"; break;
            case "c1": result = "a3 b2 d2 e3 f4 g5 h6"; break;
            case "c2": result = "a4 b1 b3 d1 d3 e4 f5 g6 h7"; break;
            case "c3": result = "a5 b2 b4 d2 d4 e1 e5 f6 g7 h8"; break;
            case "c4": result = "a6 b3 b5 d3 d5 e2 e6 f1 f7 g8"; break;
            case "c5": result = "a7 b4 b6 d4 d6 e3 e7 f2 f8"; break;
            case "c6": result = "a8 b5 b7 d5 d7 e4 e8 f3"; break;
            case "c7": result = "b6 b8 d6 d8 e5 f4 g3 h2"; break;
            case "c8": result = "b7 d7 e6 f5 g4 h3"; break;
            case "d1": result = "a4 b3 c2 e2 f3 g4 h5"; break;
            case "d2": result = "a5 b4 c3 e1 e3 f4 g5 h6"; break;
            case "d3": result = "a6 b5 c4 e2 e4 f1 f5 g6 h7"; break;
            case "d4": result = "a7 b6 c5 e3 e5 f2 f6 g1 g7 h8"; break;
            case "d5": result = "a8 b7 c6 e4 e6 f3 f7 g2 g8"; break;
            case "d6": result = "b8 c7 e5 e7 f4 f8 g3"; break;
            case "d7": result = "c8 e6 e8 f5 g4 h3"; break;
            case "d8": result = "c7 e7 f6 g5 h4"; break;
            case "e1": result = "b4 c3 d2 f2 g3 h4"; break;
            case "e2": result = "b5 c4 d3 f1 f3 g4 h5"; break;
            case "e3": result = "b6 c5 d4 f2 f4 g1 g5 h6"; break;
            case "e4": result = "b7 c6 d5 f3 f5 g2 g6 h1 h7"; break;
            case "e5": result = "b8 c7 d6 f4 f6 g3 g7 h2 h8"; break;
            case "e6": result = "c8 d7 f5 f7 g4 g8 h3"; break;
            case "e7": result = "d8 f6 f8 g5 h4"; break;
            case "e8": result = "d7 f7 g6 h5"; break;
            case "f1": result = "c4 d3 e2 g2 h3"; break;
            case "f2": result = "c5 d4 e3 g1 g3 h4"; break;
            case "f3": result = "c6 d5 e4 g2 g4 h1 h5"; break;
            case "f4": result = "c7 d6 e5 g3 g5 h2 h6"; break;
            case "f5": result = "c8 d7 e6 g4 g6 h3 h7"; break;
            case "f6": result = "d8 e7 g5 g7 h4 h8"; break;
            case "f7": result = "e8 g6 g8 h5"; break;
            case "f8": result = "e7 g7 h6"; break;
            case "g1": result = "d4 e3 f2 h2"; break;
            case "g2": result = "d5 e4 f3 h1 h3"; break;
            case "g3": result = "d6 e5 f4 h2 h4"; break;
            case "g4": result = "d7 e6 f5 h3 h5"; break;
            case "g5": result = "d8 e7 f6 h4 h6"; break;
            case "g6": result = "e8 f7 h5 h7"; break;
            case "g7": result = "f8 h6 h8"; break;
            case "g8": result = "f7 h7"; break;
            case "h1": result = "a8 b7 c6 d5 e4 f3 g2"; break;
            case "h2": result = "a7 b6 c5 d4 e3 f2 g1 g3"; break;
            case "h3": result = "a6 b5 c4 d3 e2 f1 g2 g4"; break;
            case "h4": result = "a5 b4 c3 d2 e1 f2 g3 g5"; break;
            case "h5": result = "a4 b3 c2 d1 f4 g4 g6"; break;
            case "h6": result = "a3 b2 c1 f5 g5 g7"; break;
            case "h7": result = "a2 b1 f6 g6 g8"; break;
            case "h8": result = "a1 f7 g7"; break;
            default: result = "Posición inválida.";
        }
        System.out.println("El alfil puede saltar a las siguientes casillas:");
        System.out.println(result);



    






    }
}