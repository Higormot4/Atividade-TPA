
package com.mycompany.projeto_array;

import java.util.Arrays;
import javax.swing.JOptionPane;




public class atividade1 {
    
 


    public static void main(String[] args) {
        // Criar um array para armazenar 10 nomes
        String[] nomes = new String[10];

        // Ler 10 nomes do usuário
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog(null, "Digite o nome " + (i + 1) + ":");
        }

        // Ordenar o array em ordem crescente
        Arrays.sort(nomes);

        // Exibir os nomes em ordem crescente
        StringBuilder mensagem = new StringBuilder("Nomes em ordem crescente:\n");
        for (String nome : nomes) {
            mensagem.append(nome).append("\n");
        }

        // Mostrar os nomes ordenados em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mensagem.toString());

        // Opcional: Encerrar o programa após o fechamento da caixa de diálogo
        System.exit(0);
    }
}
   


