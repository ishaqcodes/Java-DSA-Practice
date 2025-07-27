public class NthFibonacci {
    public static void main(String[] args){
        System.out.println(fib(3));
    }
    public static int fib(int n){
        return (n == 0 || n == 1) ? n : ((fib(n-1))+(fib(n-2)));
    }
}