public class SumOfElementsInNRow {
    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},
                         {11,4,3},
                         {2,2,3}};
        int sum = findSumOfRowN(matrix , 1);
        System.out.println("Sum is : " + sum);
    }
    public static int findSumOfRowN(int matrix[][], int row){
        int sum = 0;
        for(int j = 0; j <= matrix[0].length-1; j++){
            sum += matrix[row][j];
        }
        return sum;
    }
}