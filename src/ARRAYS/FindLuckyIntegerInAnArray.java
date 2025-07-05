package ARRAYS;

public class FindLuckyIntegerInAnArray {
    public static void main(String[] args) {
        FindLuckyIntegerInAnArray ans = new FindLuckyIntegerInAnArray();
        int[] arr ={1,2,2,3,3,3};
        System.out.println(ans.findLucky(arr));
    }

    public int findLucky(int[] arr) {
        int maxFreq = Integer.MIN_VALUE;
        int[] freqArray = new int[501];
        for (int i = 0; i < arr.length; i++) {
            freqArray[arr[i]]++;
        }
        for (int i = freqArray.length - 1; i > 0; i--) {
           if(freqArray[i] == i);
               maxFreq = freqArray[i];
        }
        return maxFreq;
    }
}
