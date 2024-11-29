package BITMANUPULATION;

public class ProgramToFindTheRightMostBit {
    public static void main(String[] args) {
        int n = 0;
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
    static  int rightMostSetBitPosition2(int n){
         return (int) (Math.log10(n ^ (n &(n-1)))/ Math.log10(2));
    }

}
