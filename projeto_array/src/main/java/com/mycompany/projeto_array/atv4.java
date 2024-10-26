
package com.mycompany.projeto_array;

import java.util.Arrays;

/**
 *
 * @author Higor
 */
public class atv4 {
    
     public static void main(String[] args) {
        

        // Array de 50 números
        int[] numeros = new int[50];
        
        // Preenchendo o array com números de 1 a 50
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        
        // Ordenação decrescente 
        Arrays.sort(numeros);
        
       for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        // Exibindo o array ordenado
        System.out.println("Array de 50 números em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        
        }
    }
 
    
    
    
}
