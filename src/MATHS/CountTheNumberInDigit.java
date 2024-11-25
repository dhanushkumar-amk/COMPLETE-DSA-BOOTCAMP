package MATHS;

public class CountTheNumberInDigit {
    public static void main(String[] args) {
       int n = 1234;
       System.out.println(countNumber(n));
    }

    public static int countNumber(int n){

        // initlize the count variable
        int count = 0;

        while(n > 0){
         n = n /10;
         count++;
        }
    }

}
