public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        printSpiral(matrix);
    }    

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            // left to right
            for(int j = 0; j <= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
 
            // top to bottom
            for(int i = startRow+1; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            // right to left
            for(int j = endCol-1; j >= startCol; j--){
                if(startRow == endRow){break;}
                System.out.print(matrix[endRow][j] + " ");
            }

            // bottom to top
            for(int i = endRow-1; i >= startCol+1; i--){
                if(startCol == endCol){break;}                
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
}
