public class TransposeMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        for(int i = 0; i <= matrix.length-1; i++){
            for(int j = 0; j <= matrix[0].length-1; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        transpose(matrix);
    }
    public static void transpose(int matrix[][]){
        for(int i = 0; i <= matrix.length-1; i++){
            for(int j = i+1; j <= matrix[0].length-1; j++){
                if(i == j){
                    continue;
                }
                else{
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for(int i = 0; i <= matrix.length-1; i++){
            for(int j = 0; j <= matrix[0].length-1; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}