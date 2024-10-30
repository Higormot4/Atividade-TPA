package com.mycompany.projeto_vetor;



/**
 *
 * @author Higor
 */
public class exercicio4 {

public static void main(String[] args) {
        
        // Vetor de 50 números
        int[] numeros = new int[50];
        
        // Preenchendo o array com números de 50 a 1
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 50 - i;
        }
        
        // Exibindo o array ordenado em ordem decrescente
        System.out.println("Vetor de 50 números em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

        
      
    




    

