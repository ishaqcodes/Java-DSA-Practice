public class Print1ToN {
    public static void main(String[] args) {
        int n = 10;
        printNto1(n);
    }
    public static void printNto1(int num){
        if(num == 1){
            return;
        }
        printNto1(num - 1);
        System.out.println(num);
    }
}