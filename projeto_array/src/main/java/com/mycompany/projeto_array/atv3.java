
package com.mycompany.projeto_array;

import java.util.Arrays;

/**
 *
 * @author Higor
 */

public class atv3 {
    
    public static void main(String[] args) {
        

        // Array de 50 números
        int[] numeros = new int[50];
        
        // Preenchendo o array com números de 1 a 50
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        
        // Ordenação crescente (não é necessária neste caso, pois os números já estão em ordem)
        Arrays.sort(numeros);
        
        // Exibindo o array ordenado
        System.out.println("Array de 50 números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
    

    

