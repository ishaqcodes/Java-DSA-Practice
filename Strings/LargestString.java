public class LargestString {
    public static void main(String[] args) {
        String str[] = {"apple", "banana", "mango"};
        String largest = str[0];

        for (int i = 1; i < str.length; i++) {
            if (str[i].compareToIgnoreCase(largest) > 0) {
                largest = str[i];
            }
        }

        System.out.println("Largest String is " + largest);
    }
}
