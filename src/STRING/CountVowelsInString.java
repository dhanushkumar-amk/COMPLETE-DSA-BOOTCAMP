package STRING;

public class CountVowelsInString {
    public static void main(StringBuilderandStrings[] args) {
        StringBuilderandStrings s = "dhanushkumar";
        System.out.println(count(s));
    }

    static int count(StringBuilderandStrings s){

        s = s.toLowerCase();
        int count = 0;

        for (char i = 0; i <s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                count++;
        }
        return count;
    }
}
