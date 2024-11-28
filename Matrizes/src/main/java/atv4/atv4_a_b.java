package atv4;

import java.util.Scanner;

/**
 *
 * @author Higor
 */
public class atv4_a_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializando a matriz 4x4
        double[][] matriz = new double[4][4];
        
        // Preenchendo a matriz com números decimais
        System.out.println("Preencha a matriz 4x4 com números decimais:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextDouble();
            }
        }
        
        // a) Exibir os valores da diagonal principal
        System.out.println("\na) Valores da diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        
        // b) Exibir os valores da diagonal secundária
        System.out.println("\nb) Valores da diagonal secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][4 - 1 - i] + " ");
        }
        
        scanner.close();
    }
}

