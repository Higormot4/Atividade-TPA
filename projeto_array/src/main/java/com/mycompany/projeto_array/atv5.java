
package com.mycompany.projeto_array;

/**
 *
 * @author Higor
 */
public class atv5 {
    
    public static void main(String[] args) {
        // Array de 100 números pares
        int[] pares = new int[100];
        int numero = 0;
        
        for (int i = 0; i < pares.length; i++) {
            pares[i] = numero;
            // Aqui estou adicionando 2 na variavel numero
            numero += 2;
        }
        
        // Exibindo o array de números pares
        System.out.println("Array de 100 números pares:");
        for (int par : pares) {
            System.out.println(par);
        }
    }
}
    
    
    

