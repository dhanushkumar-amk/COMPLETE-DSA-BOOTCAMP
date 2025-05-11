package ARRAYS;

// leetcode 1550
// https://leetcode.com/problems/three-consecutive-odds/description/?envType=daily-question&envId=2025-05-11


public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        ThreeConsecutiveOdds answer = new ThreeConsecutiveOdds();
        int[] arr ={1,2,34,3,4,5,7,23,12};
        System.out.println(answer.threeConsecutiveOdds(arr));
    }

    public boolean threeConsecutiveOdds(int[] arr) {

        for (int i = 0; i < arr.length - 2 ; i++) {
            if (arr[i] % 2 != 0 && arr[i+1] % 2 != 0 && arr[i + 2] % 2 != 0)
                return true;
        }
        return false;
    }
}