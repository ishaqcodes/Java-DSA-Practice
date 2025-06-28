public class FindlargestNumber {
    public static void main(String[] args) {
        int array[] = {1,2,6,3,5};
        int largestNumber = findlargest(array);

        System.out.println("Largest Number in an Array is :" + largestNumber);
    }

    public static int findlargest(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
}
