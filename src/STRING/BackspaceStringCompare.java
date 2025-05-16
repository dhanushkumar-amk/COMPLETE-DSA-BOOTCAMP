package STRING;


// leetcode : 844
// https://leetcode.com/problems/backspace-string-compare/description/

public class BackspaceStringCompare {
    public static void main(String[] args) {
        BackspaceStringCompare answer = new BackspaceStringCompare();
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(answer.backspaceCompare(s, t));
    }

    public boolean backspaceCompare(String s, String t) {
        return getActualStringFunction(s).equals(getActualStringFunction(t));
    }

    private String getActualStringFunction(String input){

        StringBuilder answer = new StringBuilder();
        int hashCount = 0;

        for(int i = input.length() - 1; i >= 0; i--){
            if(input.charAt(i) == '#'){
                hashCount++;
                continue;
            }

            if (hashCount > 0)
                hashCount--;
            else
                answer.insert(0, input.charAt(i));
        }
        return answer.toString();
    }

}