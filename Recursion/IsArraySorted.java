public class IsArraySorted {
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5};
        if(isArraySorted(arr, 0)){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted");
        }
    }
    public static boolean isArraySorted(int arr[], int i){
        return (i == arr.length-1) ? true : (arr[i] > arr[i+1]) ? false : isArraySorted(arr, i+1); 
    }
}