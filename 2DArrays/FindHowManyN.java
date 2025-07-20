public class FindHowManyN {
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},
                         {8,8,7}};
        int n = 7;
        int countOfN = findNumberOfN(matrix,n);
        if(countOfN == 0){
            System.out.println(n + " does not exist in matrix!!");
        }
        else{
            System.out.println(countOfN + " number of " + n + "'s exist in matrix");
        }
    }
    public static int findNumberOfN(int matrix[][], int n){
        int count = 0;
        for(int i = 0; i <= matrix.length-1; i++){
            for(int j = 0; j <= matrix[0].length-1; j++){
                if(matrix[i][j] == n){
                    count++;
                }
            }
        }
        return count;
    }
}