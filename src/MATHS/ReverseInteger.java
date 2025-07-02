package MATHS;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger ans = new ReverseInteger();
        int x = 1230;
        System.out.println(ans.reverse(x));
    }


    public int reverse(int x) {
        int ans = 0;
        StringBuilder str = new StringBuilder("-");
        if(x > 0) {
            while (x > 0) {
                int rem = x % 10;
                if(rem == 0)
                    continue;
                ans = ans * 10 + rem;
                x /= 10;
            }
        }
        else {
            String val = Integer.toString(x);

            for (int i = val.length() -1; i > 0 ; i--) {
                if(i == '-')
                    break;
                str.append(i);
            }
        }


        return x > 0 ? ans : Integer.parseInt(str.toString()) ;
    }

}
