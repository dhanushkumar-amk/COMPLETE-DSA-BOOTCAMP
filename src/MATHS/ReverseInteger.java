package MATHS;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger ans = new ReverseInteger();
        int x = -123;
        System.out.println(ans.reverse(x));
    }


    public int reverse(int x) {
        int ans = 0;
        while (x > 0){
            int rem = x % 10;
            ans = ans * 10 + rem;
            x /= 10;
        }
        return ans;
    }

}
