public class LinearSearch {
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int index = linearSearch(array,key);
        if(index == -1){
            System.out.println("Key Not Found in Array");
        }
        else{
            System.out.println(key + " is found at index " + index);
        }
    }

    public static int linearSearch(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
