
package atv2;

/**
 *
 * @author Higor
 */
import java.util.Scanner;
public class atv_a_b_c {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializando a matriz 5x5
        int[][] matriz = new int[5][5];
        
        // Preenchendo a matriz
        System.out.println("Preencha a matriz 5x5 com números inteiros:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // a) Soma dos números ímpares
        int somaImpares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }
        System.out.println("\na) A soma dos números ímpares fornecidos: " + somaImpares);
        
        // b) Soma de cada uma das 5 colunas
        System.out.println("\nb) Soma de cada uma das 5 colunas:");
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.printf("Soma da coluna %d: %d\n", j + 1, somaColuna);
        }
        
        // c) Soma de cada uma das 5 linhas
        System.out.println("\nc) Soma de cada uma das 5 linhas:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.printf("Soma da linha %d: %d\n", i + 1, somaLinha);
        }
        
        scanner.close();
    }
}

