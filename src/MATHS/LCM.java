package MATHS;

public class LCM {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(lcm(a, b));
    }
    static  int lcm(int a, int b){
        int result = Math.max(a, b);
        for (int i = result; i < 10000; i++) {
            if (result % a == 0 && result % b == 0){
                break;
            }
        }
        return result;
    }
}
