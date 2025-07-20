public class SortedMatrixSearch{
    public static void main(String[] args){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key = 29;
        search(matrix,key);
    }
    public static boolean search(int matrix[][], int key){
        int i = 0;
        int j = matrix[0].length-1;

        while(j >= 0 && i <= matrix.length-1){
            if(key == matrix[i][j]){
                System.out.println("Key found at index :" + "(" + i + " , " + j + ")");
                return true;
            }
            else if(key < matrix[i][j]){
                j--;
            }
            else if(key > matrix[i][j]){
                i++;
            }
        }
        System.out.println("Key not Found!!");
        return false;
    }
}