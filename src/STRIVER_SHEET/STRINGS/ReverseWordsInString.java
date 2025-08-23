package STRIVER_SHEET.STRINGS;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1;  i >= 0 ; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}
