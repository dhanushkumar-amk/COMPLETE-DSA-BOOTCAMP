package MATHS;

// leetcode 50
//https://leetcode.com/problems/powx-n/description/

public class PowXN {
    public static void main(String[] args) {
        PowXN answer = new PowXN();
        double x = 2.00000;
        int n = 10;
        System.out.println(answer.myPow(x, n));
    }

    public double myPow(double x, int y){
       int n = Math.abs(y);
        double answer = 1.0;
        while (n >= 1){
            if (n % 2 == 1)
                answer *= n;

            n /= 2;
            x *= x;
        }
        return y < 0 ? 1/answer : answer;
    }
}

/*
 public double myPow(double x, int n) {
        return (double) Math.pow(x, n);
    }
 */