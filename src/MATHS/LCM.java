package MATHS;

public class LCM {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        lcm(a, b);
    }
    static  int lcm(int a, int b){
        int result = Math.max(a, b);
        while (true){
            if (result % a == 0 && result % b == 0){
                break;
            }
            result++;
        }
        return result;
    }
}
