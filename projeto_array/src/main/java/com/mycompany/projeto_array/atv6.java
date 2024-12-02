
package com.mycompany.projeto_array;

/**
 *
 * @author Higor
 */
public class atv6 {
    
    public static void main(String[] args) {
        // Array de 100 números ímpares
        int[] impares = new int[100];
        int numero = 1;
        
        for (int i = 0; i < impares.length; i++) {
            impares[i] = numero;
            // Estou fazendo a mesma coisa do exercicio passado
            numero += 2;
        }
        
        // Exibindo o array de números ímpares
        System.out.println("Array de 100 números ímpares:");
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}
    
    

