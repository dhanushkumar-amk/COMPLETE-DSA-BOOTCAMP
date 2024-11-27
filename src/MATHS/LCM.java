package MATHS;

public class LCM {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(lcm(a, b));
    }
    static  int lcm(int a, int b){
        int result = Math.max(a, b);
        int ans = 0;
        for (int i = result; i < 10000; i++) {
            if (a% i == 0 && b % i == 0){
                ans = i;

            }
            break;
        }
        return ans;
    }
}
