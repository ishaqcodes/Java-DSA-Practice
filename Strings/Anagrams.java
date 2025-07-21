import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        if(isAnagrams(str1,str2)){
            System.out.println("Both are Anagrams");
        }
        else{
            System.out.println("Both are not Anagrams");
        }
    }
    public static boolean isAnagrams(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length()){
            char str1CharArray[] = str1.toCharArray();
            char str2CharArray[] = str2.toCharArray();
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            return Arrays.equals(str1CharArray,str2CharArray);
        }
        return false;
    }
}