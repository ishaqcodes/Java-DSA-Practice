public class SubArrays {
    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        printSubArray(array);
    }

    public static void printSubArray(int arr[]) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {  // j starts from i
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "  ");
                    currSum += arr[k];
                }
                totalSum++;
                System.out.println("Sum : " + currSum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subArrays : " + totalSum);
    }
}
