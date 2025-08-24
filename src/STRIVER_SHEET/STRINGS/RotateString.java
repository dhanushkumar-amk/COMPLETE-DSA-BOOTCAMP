package STRIVER_SHEET.STRINGS;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        String newString = s + s;
        return newString.contains(goal);
    }
}
