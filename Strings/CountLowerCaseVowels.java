public class CountLowerCaseVowels {
    public static void main(String[] args) {
        String str = "Ishaq";
        countVowels(str);
    }
    public static void countVowels(String str){
        Integer count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("Count of Vowels : " + count);
    }
}