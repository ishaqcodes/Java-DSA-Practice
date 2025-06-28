public class ReverseArray {
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        reverse(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void reverse(int arr[]){
        int i = 0;
        int j = arr.length-1;

        while(i <= j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

            i++;
            j--;
        }
    }
}
