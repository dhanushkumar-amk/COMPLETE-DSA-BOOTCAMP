package MATHS;

import java.util.Scanner;

public class CountTheNumberInDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        int n = sc.nextInt();
       System.out.println(countNumber(n));
    }
    public static int countNumber(int n){
        // init the count variable

        int count = 0;
        while(n > 0){
         n = n /10;
         count++;
        }
        return count;
    }
}
