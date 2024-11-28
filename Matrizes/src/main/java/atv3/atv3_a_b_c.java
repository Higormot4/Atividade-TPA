
package atv3;

import java.util.Scanner;

/**
 *
 * @author Higor
 */
public class atv3_a_b_c {
   
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
        // Inicializando a matriz 3x5
        int[][] matriz = new int[3][5];
        
        // Preenchendo a matriz
        System.out.println("Preencha a matriz 3x5 com números inteiros:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // a) Verificar se a matriz possui elementos repetidos
        boolean temRepetidos = false;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = i; k < 3; k++) {
                    for (int l = (k == i ? j + 1 : 0); l < 5; l++) {
                        if (matriz[i][j] == matriz[k][l]) {
                            temRepetidos = true;
                            break;
                        }
                    }
                    if (temRepetidos) break;
                }
                if (temRepetidos) break;
            }
            if (temRepetidos) break;
        }
        
        if (temRepetidos) {
            System.out.println("\na) A matriz possui elementos repetidos.");
        } else {
            System.out.println("\na) A matriz não possui elementos repetidos.");
        }
        
        // b) Quantidade de números pares
        int quantidadePares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 0) {
                    quantidadePares++;
                }
            }
        }
        System.out.println("\nb) Quantidade de números pares: " + quantidadePares);
        
        // c) Quantidade de números ímpares
        int quantidadeImpares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    quantidadeImpares++;
                }
            }
        }
        System.out.println("\nc) Quantidade de números ímpares: " + quantidadeImpares);
        
        scanner.close();
    }
}
    
    
    
    

