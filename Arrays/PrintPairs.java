public class PrintPairs {
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        printPairs(array);
    }

    public static void printPairs(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            for(int j = i+1; j < arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
}
