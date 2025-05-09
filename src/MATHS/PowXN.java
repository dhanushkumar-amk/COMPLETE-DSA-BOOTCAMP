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
        y = Math.abs(y);
        double answer = 1.0;
        while (y >= 1){
            if (y % 2 == 1)
                answer *= y;

            y /= 2;
            x *= x;
        }
        return answer;
    }
}

/*
 public double myPow(double x, int n) {
        return (double) Math.pow(x, n);
    }
 */