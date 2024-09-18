import java.util.Scanner;

public class NumerosImparesDecrescentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para digitar os números
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

       
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

       
        System.out.println("Números ímpares entre " + num1 + " e " + num2 + ":");
        int i = num1;
        while (i >= num2) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            
        }

        scanner.close();
    }
}

