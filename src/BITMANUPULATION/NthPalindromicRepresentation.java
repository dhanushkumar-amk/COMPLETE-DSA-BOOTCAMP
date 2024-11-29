package BITMANUPULATION;

public class NthPalindromicRepresentation {
    public static void main(String[] args) {
    int n = 21;
        System.out.println(palindromic(n));
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

        answer = answer | reverse(answer, length);

        return answer;
    }


  public   static  int reverse(int n, int length){
        int first =  length - 1;
        int last = 0;
        int reverse = 0;
        while (first > last){
            if ((n & (1 << first)) != 0){
                reverse = reverse | (1 << last);
            }

            if ((n & (1 << last)) != 0){
                reverse = reverse | (1 << first);
            }

            first--;
            last++;
        }
        return reverse;
    }
}
