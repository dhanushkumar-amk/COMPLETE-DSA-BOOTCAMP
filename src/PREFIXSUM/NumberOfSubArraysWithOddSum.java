package PREFIXSUM;

public class NumberOfSubArraysWithOddSum {
    public static void main(String[] args) {

    }

    static int mod  =(int) 1e9 + 7;
    public int numOfSubarrays(int[] arr) {

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
