public class RemoveDuplicateStr {
    public static void main(String[] args) {
        String str = "appnnancolleage";
        boolean seen[] = new boolean[30];
        String result = removeDuplicate(str, 0, seen, "");
        System.out.println(result);
    }
    public static String removeDuplicate(String str, int index, boolean seen[], String result){
        if(index == str.length()){
            return result;
        }
        char currChar = str.charAt(index);
        int charIdx = currChar - 'a';
        if(!seen[charIdx]){
            seen[charIdx] = true;
            result += currChar;
        }
        return removeDuplicate(str, index+1, seen, result);
    }
}