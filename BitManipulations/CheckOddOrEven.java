public class CheckOddOrEven{
    public static void main(String[] args){
        isOddEven(5);
        isOddEven(2);
    }
    public static void isOddEven(int num){
        int bitMask = 1;
        if((num & bitMask) != 0){
            System.out.println(num + " is ODD");
        }
        else{
            System.out.println(num + " is EVEN");
        }
    }
}