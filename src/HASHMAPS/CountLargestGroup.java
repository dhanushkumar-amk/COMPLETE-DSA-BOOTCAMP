package HASHMAPS;

// leetcode 1399
// https://leetcode.com/problems/count-largest-group/description/?envType=daily-question&envId=2025-04-23

public class CountLargestGroup {

    public static void main(String[] args) {
        CountLargestGroup answer = new CountLargestGroup();
        System.out.println(answer.countLargestGroup(13));
    }

    public int countLargestGroup(int n) {
        int[] hash =new int[40];
        for (int i = 1; i <=n; i++) {
            int ds = digitSum(i);
            
        }
    }

    private int digitSum(int num) {
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
