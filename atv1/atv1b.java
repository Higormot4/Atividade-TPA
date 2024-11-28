
package atv1;

/**
 *
 * @author Higor
 */
public class atv1b {
    public static void main(String[] args) {
        
        int[][] matriz = {
        {19, 25, 100, 99},
        {10,7,25,14},
        {35,2,47,74} ,       
            
        };     
        
        System.out.println("Matriz 3x4");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(); // Pula para a próxima linha
        }
        
    }
}
