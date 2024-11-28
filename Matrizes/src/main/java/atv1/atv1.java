
package atv1;


public class atv1 {
    public static void main(String[] args) {
        // Definindo a matriz de caracteres
        char[][] matriz = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'l', 'm', 'n', 'o', 'p'},
            {'q', 'r', 's', 't', 'u'}
        };

        // Exibindo a matriz
        System.out.println("Matriz 4x5 de caracteres:");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(); // Pula para a próxima linha
        }
    }
}
