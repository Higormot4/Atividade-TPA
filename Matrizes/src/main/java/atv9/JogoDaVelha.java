/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv9;

import java.util.Scanner;

/**
 *
 * @author Higor
 */
public class JogoDaVelha {
    
    public static void main(String[] args) {
        char[][] tabuleiro = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        char jogadorAtual = 'X';
        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", escolha linha e coluna (0-2):");

            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;

                if (verificarVencedor(tabuleiro, jogadorAtual)) {
                    imprimirTabuleiro(tabuleiro);
                    System.out.println("Jogador " + jogadorAtual + " venceu!");
                    break;
                } else if (tabuleiroCheio(tabuleiro)) {
                    imprimirTabuleiro(tabuleiro);
                    System.out.println("Empate!");
                    break;
                }

                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Posição ocupada, tente novamente.");
            }
        }
        scanner.close();
    }

    public static void imprimirTabuleiro(char[][] tabuleiro) {
        for (char[] linha : tabuleiro) {
            for (char celula : linha) {
                System.out.print(celula + " ");
            }
            System.out.println();
        }
    }

    public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        return (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
               (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador);
    }

    public static boolean tabuleiroCheio(char[][] tabuleiro) {
        for (char[] linha : tabuleiro) {
            for (char celula : linha) {
                if (celula == ' ') return false;
            }
        }
        return true;
    }
}
