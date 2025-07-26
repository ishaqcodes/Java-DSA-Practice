public class SumOfNnumbers {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int n){
        return (n == 1) ? 1 : (n + sum(n - 1));
    }
}