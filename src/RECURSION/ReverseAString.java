package RECURSION;

public class ReverseAString {
    public static void main(String[] args) {
     String s = "hello";
     String r = "";
     int index  = s.length()-1;
     System.out.println(reverse(s,r,index));
    }

    static  String reverse(String s, String r, int index){
        if (index < 0)
            return r;

        return reverse(s, r+s.charAt(index), index - 1);
    }
}
