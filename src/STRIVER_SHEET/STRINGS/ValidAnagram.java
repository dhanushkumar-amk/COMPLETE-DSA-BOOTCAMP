package STRIVER_SHEET.STRINGS;

public class ValidAnagram {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        s =  s.toLowerCase();
        t =  t.toLowerCase();

        s = s.replace(" ", "");
        t = t.replace(" ", "");

        int[] words = new int[26];
        for(int i =0; i<s.length(); i++){
            words[s.charAt(i)- 'a']++;
        }
        for(int i =0; i<t.length(); i++){
            words[t.charAt(i)- 'a']--;
        }

        for(int word : words){
            if(word != 0)
                return false;
        }
        return true;
    }
}
