public class FindSmallestNumber {
    public static void main(String[] args) {
        int array[] = {1,2,6,3,5};
        int smallestNumber = findsmallest(array);
        System.out.println("Largest Number in an Array is :" + smallestNumber);
    }

    public static int findsmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
