public class CheckNumIsPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // A number is a power of two if it is greater than 0 and
        // the bitwise AND of the number and its predecessor is 0.
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 16; // Example number
        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of two.");
        } else {
            System.out.println(num + " is not a power of two.");
        }
    }
}