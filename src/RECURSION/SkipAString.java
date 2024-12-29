package RECURSION;

public class SkipAString {
    public static void main(String[] args) {
        String s = "helloappleworld";
        System.out.println(SkipApple(s));
    }


    static String SkipApple(String s){

        if (s.isEmpty())
            return "";

        if (s.startsWith("apple"))
            return SkipApple(s.substring(5));
        else
            return s.charAt(0) + SkipApple(s.substring(1));
    }

}
