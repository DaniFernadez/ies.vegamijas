import java.util.Scanner;

public class F {
 public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la posición del alfil (ejemplo d4): ");
        String pos = sc.nextLine().trim().toLowerCase();

        if (pos.length() != 2 || pos.charAt(0) < 'a' || pos.charAt(0) > 'h' || pos.charAt(1) < '1' || pos.charAt(1) > '8') {
            System.out.println("Posición inválida.");
            return;
        }

        int col = pos.charAt(0) - 'a'; // 0-7
        int row = pos.charAt(1) - '1'; // 0-7

        System.out.println("El alfil puede saltar a las siguientes casillas:");

        // Direcciones: [fila, columna]
        int[][] dirs = { {1,1}, {1,-1}, {-1,1}, {-1,-1} };
        for (int i = 0; i < dirs.length; i++) {
            int r = row + dirs[i][0];
            int c = col + dirs[i][1];
            while (r >= 0 && r < 8 && c >= 0 && c < 8) {
                char colChar = (char)('a' + c);
                char rowChar = (char)('1' + r);
                System.out.print(colChar);
                System.out.print(rowChar + " ");
                r += dirs[i][0];
                c += dirs[i][1];
            }
        }
        System.out.println();



    






    }
}