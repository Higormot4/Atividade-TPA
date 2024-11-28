package atv5;

/**
 *
 * @author Higor
 */
public class atv5b {
   public static void main(String[] args) {
        int linhas = 4; // Número de linhas
        int colunas = 4; // Número de colunas
        
        // Criando a matriz 4x4
        char[][] matriz = new char[linhas][colunas];
        
       
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1) {
                    matriz[i][j] = '*';  // Preenche as bordas com '*'
                } else {
                    matriz[i][j] = ' ';  // Preenche o centro com espaço
                }
            }
        }
        
        // Exibindo a matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(); // Para quebrar a linha após cada linha da matriz
        }
    }
}  

