package RECURSION;

public class GenerateAllBalancedParentheses {
    public static void main(String[] args) {

        int n = 2;
        char[] arr = new char[n * 2];
        int openingBraceCount = 0;
        int closingBraceCount = 0;
        int index = 0;

        generate(arr, n, index, openingBraceCount, closingBraceCount);

    }

    static void generate(char[] arr, int n, int index, int openingBraceCount, int closingBraceCount){

        // base case
        if (index == arr.length)
            System.out.println("The possible answer is : " + arr);

        if(openingBraceCount < n){
            arr[index] = 'C';
            generate(arr, n, index + 1, openingBraceCount + 1, closingBraceCount);
        }

        if (closingBraceCount < n){
            arr[index] = ')';
            generate(arr, n, index + 1, openingBraceCount, closingBraceCount + 1);
        }
    }
}
