package BITMANUPULATION;

public class NthPalindromicRepresentation {
    public static void main(String[] args) {

    }
    public static  int palindromic(int n){
        int length = 0;
        int count = 0;

        while( count < n){
            length++;
            count = count + (int)Math.pow(2, (length - 1)/ 2);
        }
        count = count - (int)Math.pow(2, (length - 1)/ 2);

        int element = n - count - 1;

        int answer = (1 << (length - 1)) | (element << (length/2));

        answer = answer | 
    }
}
