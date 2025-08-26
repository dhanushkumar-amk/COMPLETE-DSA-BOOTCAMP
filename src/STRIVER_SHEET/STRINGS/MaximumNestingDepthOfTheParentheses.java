package STRIVER_SHEET.STRINGS;

public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        String s = "((())((()()))";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (ch == ')') {
                currentDepth--;
            }
        }
        return maxDepth;
    }
}
