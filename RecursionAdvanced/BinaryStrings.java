public class BinaryStrings {
    public static void main(String[] args) {
        int n = 3; // Length of binary strings
        
        
        generateBinaryStrings(n, 0, "");
    }

    public static void generateBinaryStrings(int n, int lastPlace, String str) {
        if(n == 0){
            System.out.println(str);
            return;
        }

        generateBinaryStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            generateBinaryStrings(n-1, 1, str+"1");
        }
    }
}