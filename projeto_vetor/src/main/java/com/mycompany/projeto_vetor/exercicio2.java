
package com.mycompany.projeto_vetor;



/**
 *
 * @author Higor
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Higor
 */
public class exercicio2 {
  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Vetor de 15 nomesq
        
        String[] nomes = new String[15];
        
        // Recebendo os nomes do usuário
        System.out.println("Digite 15 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        // Ordenação decrescente
        Arrays.sort(nomes, Collections.reverseOrder());
        
        // Exibindo o array ordenado
        System.out.println("\nVetor de 15 nomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}
