package RECURSION;

public class GenerateAllBalancedParentheses {
    public static void main(String[] args) {

        int n = 10;
        char[] arr = new char[n * 2];
        int openingBraceCount = 0;
        int closingBraceCount = 0;
        int index = 0;

        generate(arr, n, index, openingBraceCount, closingBraceCount);

    }

    static void generate(char[] arr, int n, int index, int openingBraceCount, int closingBraceCount){

        // base case
        if (index == arr.length)
            System.out.println (arr);

        if(openingBraceCount < n){
            arr[index] = '(';
            generate(arr, n, index + 1, openingBraceCount + 1, closingBraceCount);
        }

        if (closingBraceCount < openingBraceCount){
            arr[index] = ')';
            generate(arr, n, index + 1, openingBraceCount, closingBraceCount + 1);
        }
    }
}
