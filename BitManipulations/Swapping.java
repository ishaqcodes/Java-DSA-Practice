public class Swapping {
    public static void main(String[] args) {
        int x = 3, y = 4;
        System.out.println("Before Swapping : x = " + x + " and y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After Swapping : x = " + x + " and y = " + y);
    }
}