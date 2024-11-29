package BITMANUPULATION;

public class CountTheLongestConsecutiveOnesInBinaryRepresentationINGivenNumber {
    public static void main(String[] args) {
        int n = 101;
        System.out.println(countTheValues(n));

    }
    static  int countTheValues(int n){
        int count = 0;
         while (n != 0){
             n = n & (n << 1);
             count++;
         }
         return count;
    }
}
