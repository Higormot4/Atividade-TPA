
package atv1;


public class atv1c {
    public static void main(String[] args) {
        
        
        double[][] matriz = {
        {1.9, 2.5, 10.0,},
        {1.0,7.8,2.5,},
        {3.5,2.2,4.7,} ,       
            
        };     
        
        System.out.println("Matriz 3x3");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(); // Pula para a próxima linha
        }
        
    }
    }

