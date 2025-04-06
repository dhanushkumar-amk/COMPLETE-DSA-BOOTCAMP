package MATHS;

// https://leetcode.com/problems/valid-perfect-square/description/
// leetcode 367


public class ValidPerfectSquare {

    public static void main(String[] args) {
        ValidPerfectSquare ans = new ValidPerfectSquare();
        System.out.println(ans.isPerfectSquare(36));
    }

    public boolean isPerfectSquare(int num){
        int oddNumber = 1;
        int sum = 1;

        while (sum <= num){

            if (sum == num)
                return true;

            oddNumber += 2;
            sum += oddNumber;
        }

        return false;

    }

}
