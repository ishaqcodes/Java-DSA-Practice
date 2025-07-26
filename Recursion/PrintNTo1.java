public class PrintNTo1 {
    public static void main(String[] args) {
        int n = 10;
        printNto1(n);
    }
    public static void printNto1(int num){
        if(num == 1){
            return;
        }
        System.out.println(num);
        printNto1(num - 1);
    }
}