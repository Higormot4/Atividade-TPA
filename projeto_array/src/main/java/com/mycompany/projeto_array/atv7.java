
package com.mycompany.projeto_array;

/**
 *
 * @author Higor
 */
public class atv7 {
    
    public static void main(String[] args) {
        // Array com os times na classificação atual
        String[] classificacao = {"Botafogo", "Palmeiras", "Fortaleza", "Flamengo", "São Paulo", 
                                  "Internacional", "Bahia", "Cruzeiro", "Atlético-MG", "Vasco","Grêmio","Fluminense",
                                  "Criciúma","Vitória","Juventude","Bragantino","Corinthians","Athletico-PR","Cuiabá","Atletico-GO",      };
        
        // Exibindo a tabela de classificação
        System.out.println("Tabela de classificação do Campeonato Brasileiro:");
        for (int i = 0; i < classificacao.length; i++) {
            System.out.println((i + 1) + "º - " + classificacao[i]);
        }
    }
}
    

