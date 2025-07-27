public class LastOccurrence {
    public static void main(String[] args){
        int arr[] = {1,2,5,4,3,5,3,6};
        int key = 5;
        int index = findLastOccur(arr, key, arr.length-1);
        if(index == -1){
            System.out.println(key + " is not existed in array");
        }else{
            System.out.println(key + " Last occur at index " + index);
        }
    }
    public static int findLastOccur(int arr[], int n, int i){
        return (i == 0) ? -1 : (arr[i] == n) ? i : findLastOccur(arr, n, i-1);
    }
}