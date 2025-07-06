package STRING;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        String s = "abc21";
        System.out.println(findSum(s));

    }
    public static int findSum(String s) {
        int result  = 0;
        int currentValue = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch > 0 && !Character.isDigit(ch)){
                result += currentValue;
                currentValue = 0;
            }
            if(Character.isDigit(ch)){
                currentValue *= 10 + ch;
            }
        }
        return currentValue > 0 ? result += currentValue : result;
    }
}
