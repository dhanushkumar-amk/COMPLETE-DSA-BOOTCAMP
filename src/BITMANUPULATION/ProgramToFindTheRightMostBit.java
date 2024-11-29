package BITMANUPULATION;

public class ProgramToFindTheRightMostBit {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(rightMostSetBitPosition2(n));
    }

    // method 1
    static  int rightMostSetBitPosition1(int n){
        int mask = 1;
        int position = 0;// assume intialize it zero


        if (n == 0)
            return -1;

        while ((n & mask) == 0){
            mask = mask << 1;
            position++;
        }
        return position + 1; // for zero based indexing
    }

    // method 2
// Method to find the position of the rightmost set bit in a number
    static int rightMostSetBitPosition2(int n) {
        // Step 1: Clear the rightmost set bit of n using n & (n - 1)
        int clearedRightmostBit = n & (n - 1);

        // Step 2: Isolate the rightmost set bit using XOR
        int isolatedRightmostBit = n ^ clearedRightmostBit;

        // Step 3: Find the logarithm base 2 of the isolated rightmost bit
        double logBase2 = Math.log10(isolatedRightmostBit) / Math.log10(2);

        // Step 4: Convert the logarithmic result to an integer and add 1 to get the position
        int position = (int) logBase2 + 1;

        // Step 5: Return the final position of the rightmost set bit
        return position;
    }


    // single line representation
    /*
        static  int rightMostSetBitPosition2(int n){
         return (int) (Math.log10(n ^ (n &(n-1)))/ Math.log10(2)) + 1;
    }
     */


}
