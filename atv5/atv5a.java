package atv5;

/**
 *
 * @author Higor
 */
public class atv5a {
 public static void main(String[] args) {
        // Definindo a matriz de caracteres
        char[][] matriz = {
            {'*', '*', '*', '*', },
            {'*', '*', '*', '*', },
            {'*', '*', '*', '*', },
            {'*', '*', '*', '*', }
        };

        // Exibindo a matriz
        System.out.println("Matriz 4x4:");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();     
        }
 }

}