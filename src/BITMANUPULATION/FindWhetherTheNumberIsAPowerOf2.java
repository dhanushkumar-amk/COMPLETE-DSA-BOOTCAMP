package BITMANUPULATION;

public class FindWhetherTheNumberIsAPowerOf2 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(powerOf2(n));
    }
    static  boolean powerOf2(int n){
        // base case
        if (n==0)
            return false;

        return  (n &(n -1 ))==0;
    }
}
