package ARRAYS;

public class FindLuckyIntegerInAnArray {
    public static void main(String[] args) {
        FindLuckyIntegerInAnArray ans = new FindLuckyIntegerInAnArray();
        int[] arr ={2,2,3,4};
        System.out.println(ans.findLucky(arr));
    }

    public int findLucky(int[] arr) {
        int maxFreq = Integer.MIN_VALUE;
        int[] freqArray = new int[500];
        for (int i = 1; i < arr.length; i++) {
            freqArray[i]++;
        }
        for (int i = freqArray.length - 1; i >= 0; i--) {
           if(freqArray[i] == i)
               maxFreq = i;
        }
        return maxFreq;
    }
}
