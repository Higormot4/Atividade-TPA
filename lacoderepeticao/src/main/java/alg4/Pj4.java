package alg4;

import java.util.Scanner;


public class Pj4 {
  
     static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor inicial (ímpar): ");
    int valorInicial = scanner.nextInt();

    System.out.print("Digite o valor final (ímpar): ");
    int valorFinal = scanner.nextInt();

    if (valorInicial % 2 == 0) {
        valorInicial++;
    }
    if (valorFinal % 2 == 0) {
        valorFinal--;
    }

    int somaImpares = 0;

    for (int numero = valorInicial; numero <= valorFinal; numero += 2) {
        somaImpares += numero;
    }

    System.out.println("A soma dos números ímpares entre " + valorInicial + " e " + valorFinal + " é: " + somaImpares);

    scanner.close();
}
}
