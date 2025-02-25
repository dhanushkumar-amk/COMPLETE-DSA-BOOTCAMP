package PREFIXSUM;

public class NumberOfSubArraysWithOddSum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(numOfSubarrays(arr));
    }

    static int mod  =(int) 1e9 + 7;
    public static int numOfSubarrays(int[] arr) {

        int result = 0;
        int prefixSum = 0;
        int oddCount = 0;
        int evenCount = 0;

        for(int num : arr){

            prefixSum += num;

            if (prefixSum % 2 == 0){
                result = (result + oddCount) % mod;
                evenCount++;
            }
            else{
                result = (result + evenCount) % mod;
                oddCount++;
            }
        }
    return result;
    }
}
