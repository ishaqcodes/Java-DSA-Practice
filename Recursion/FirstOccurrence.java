public class FirstOccurrence {
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,3,5,3,6};
        int key = 5;
        int index = findFirstOccur(arr, key, 0);
        if(index == -1){
            System.out.println(key + " is not existed in array");
        }else{
            System.out.println(key + " first occur at index " + index);
        }
    }
    public static int findFirstOccur(int arr[], int n, int i){
        return (i == arr.length-1) ? -1 : (arr[i] == n) ? i : findFirstOccur(arr, n, i+1);
    }
}