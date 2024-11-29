package BITMANUPULATION;

public class SetBitsOfAnInteger {
    public static void main(String[] args) {
        int n = 101;
        System.out.println(reverse(n));
    }

    static  int reverse(int n){
        int first = 31;
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
