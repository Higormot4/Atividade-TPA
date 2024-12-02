/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv6;

import javax.swing.JOptionPane;

/**
 *
 * @author Higor
 */
public class atv6 {
    public static void main(String[] args) {
        final int N_Lin = 3, N_Col = 3; // final para definir constante
        int[][] mat = new int[N_Lin][N_Col];
        int l, c;

        JOptionPane.showMessageDialog(null, "** Cadastrando dados na matriz **\nEntre com o valor em cada posição da matriz");

        // Atribuição dos valores na matriz
        for (l = 0; l < N_Lin; l++) {
            for (c = 0; c < N_Col; c++) {
                mat[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Valor linha " + (l + 1) + " coluna " + (c + 1) + ":"));
            }
        }

        JOptionPane.showMessageDialog(null, "** Exibindo os dados da matriz **");

        // Exibição dos valores na matriz
        for (l = 0; l < N_Lin; l++) {
            for (c = 0; c < N_Col; c++) {
                System.out.print(mat[l][c] + " ");
            }
            System.out.print("\n"); // para organizar a apresentação em linhas diferentes
        }
    }
}

