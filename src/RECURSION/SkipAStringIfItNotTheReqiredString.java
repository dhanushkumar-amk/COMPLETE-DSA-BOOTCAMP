package RECURSION;

public class SkipAStringIfItNotTheReqiredString {
    public static void main(String[] args) {
        String s = "helloappapple";
        System.out.println(skipRequired(s));
    }

    static String skipRequired(String s){

        if (s.isEmpty())
            return "";

        if (s.startsWith("app") && !s.startsWith("apple"))
            return skipRequired(s.substring(3));
        else
            return s.charAt(0) + skipRequired(s.substring(1));
    }
}
