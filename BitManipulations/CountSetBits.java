public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits(10));
    }
    public static int countSetBits(int n){
       int bitMask = 1;
       int count = 0;
       while(n > 0){
        if((n & bitMask) != 0){
            count++;
        }
        n = n >> 1;
       }
       return count; 
    }
}