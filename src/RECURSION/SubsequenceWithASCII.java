package RECURSION;

public class SubsequenceWithASCII {
    public static void main(String[] args) {

        subSequence("", "abc");

    }
    static  void subSequence(String answer, String orginal){

        if (orginal.isEmpty()){
            System.out.println(answer);
            return;
        }

        char ch = orginal.charAt(0);

        subSequence(answer + ch, orginal.substring(1)); // for picking
        subSequence(answer, orginal.substring(1)); // for not picking
        subSequence(answer + (ch + 0), orginal.substring(1));  // for acsii value

    }
}
