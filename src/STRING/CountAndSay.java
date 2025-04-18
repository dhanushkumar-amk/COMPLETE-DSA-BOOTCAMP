package STRING;

// http://leetcode.com/problems/count-and-say/?envType=daily-question&envId=2025-04-18
// leetcode 38

public class CountAndSay {

    public static void main(String[] args) {

    CountAndSay answer = new CountAndSay();
    System.out.println(answer.countAndSay(4));

    }

    public String countAndSay(int n) {

        String s = "1";
        for (int i = 1; i < n; i++) {
            s = RLE(s);
        }
        return  s;
    }

    private String RLE(String s) {
        char ch = s.charAt(0);
        int count = 1;
        int i = 1;
        int n = s.length();
        StringBuilder stringBuilder = new StringBuilder();

        while (i < n){
            if (s.charAt(i) == ch)
                count++;
            else{
                stringBuilder.append(count).append(ch);
                ch = s.charAt(i);
                count = 1;
            }
            i++;
        }
        stringBuilder.append(count).append(ch);
        return stringBuilder.toString();
    }
}
