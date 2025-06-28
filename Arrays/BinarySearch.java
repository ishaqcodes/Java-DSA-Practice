public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int index = binarySearch(array,key);
        if(index == -1){
            System.out.println("Key Not Found in Array");
        }
        else{
            System.out.println(key + " is found at index " + index);
        }
    }

    public static int binarySearch(int arr[], int key){
        int i = 0;
        int j = arr.length-1;
        while(i <= j){
            int mid = (i+j)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return -1;
    }
}
