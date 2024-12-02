/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv8;

import javax.swing.JOptionPane;

/**
 *
 * @author Higor
 */
public class atv8 {
    

public class Exemplo_9 {
    public static void main(String[] args) {
        int[][] mat = {{1, 42, 23, 14, 51}, {22, 32, 55, 54, 12}};
        int x, y;
        JOptionPane.showMessageDialog(null, "** Exibindo apenas os elementos pares da matriz **");

        // exibição dos valores na matriz
        for (x = 0; x < 2; x++) {
            for (y = 0; y < 5; y++) {
                if (mat[x][y] % 2 == 0) {
                    System.out.print(mat[x][y] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.print("\n");
        }
       }
   }

}
    

