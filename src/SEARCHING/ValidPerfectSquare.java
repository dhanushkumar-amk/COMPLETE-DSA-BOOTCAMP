package SEARCHING;

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num){
        if (num < 0)
            return false;

        if (num == 1 || num == 0)
            return true;

        long left = 1;
        long right = num;

        while (left < right){

            long mid = left + (right - left)/2;
            long square = mid * mid;

            if (square == mid)
                return true;
            else if (square < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

}
