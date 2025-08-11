public class TilingProblem {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Ways to Tile  2 x " + n + " board = " + countWays(n));
    }
    public static int countWays(int n){
        return (n == 0 || n == 1) ? 1 :(countWays(n - 1) + countWays(n - 2));
    }   
}