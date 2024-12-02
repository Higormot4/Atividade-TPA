
package com.mycompany.projeto_array;
import java.util.Arrays;
import java.util.Collections;


public class atv2 {
    public static void main(String[] args) {
        
        // Array de 20 nomes
        String[] nomes = {"Ana", "Carlos", "Beatriz", "Daniel", "Eduardo", "Fátima", "Gabriel", "Higor", "Isabel", "José", 
                          "Karla", "Lucas", "Marcelo", "Nathalia", "Otávio", "Patrícia", "Renan", "Sabrina", "Tânia", "Vitor"};
        
        // Ordenação decrescente
        Arrays.sort(nomes, Collections.reverseOrder());
        
        // Exibindo o array ordenado
        System.out.println("Array de 20 nomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
} 
        
        
        
        
        
    
    

