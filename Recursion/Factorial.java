public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        return (n == 1) ? 1 : (n * fact(n -1)); 
    }
}