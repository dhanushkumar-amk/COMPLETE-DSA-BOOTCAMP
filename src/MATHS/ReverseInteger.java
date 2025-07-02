package MATHS;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger ans = new ReverseInteger();
        int x = -123;
        System.out.println(ans.reverse(x));
    }


    public int reverse(int x) {
        int ans = 0;
        if(x > 0) {
            while (x > 0) {
                int rem = x % 10;
                ans = ans * 10 + rem;
                x /= 10;
            }
        }
        else {
            String val = Integer.toString(x);
            StringBuilder str = new StringBuilder("-");
            for (int i = val.length(); i > 0 ; i--) {
                if(i == '-')
                    break;
                str.append(i);
            }
        }

        return x > 0 ? ans : str ;
    }

}
