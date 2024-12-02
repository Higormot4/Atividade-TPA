
package com.mycompany.projeto_vetor;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Higor
 */
public class exercicio1 {
    
  
    
    public static void main(String[] args) {
        String[] nomes = new String[15];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + ":");
        }

        Arrays.sort(nomes);

        JOptionPane.showMessageDialog(null, "Nomes em ordem crescente:\n"+ Arrays.toString(nomes));
        System.exit(0);
    }
}

    
    

