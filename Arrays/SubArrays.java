public class SubArrays {
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        printSubArray(array);
    }

    public static void printSubArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
