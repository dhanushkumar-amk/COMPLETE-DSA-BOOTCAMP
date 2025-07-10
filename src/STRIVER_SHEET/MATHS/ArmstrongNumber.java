package STRIVER_SHEET.MATHS;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(152));
    }

    public static  boolean isArmstrongNumber(int n){
        int x = n;
        int temp = 0;
        while(n != 0){
            int rem = n % 10;
            temp += rem * rem * rem;
            n /= 10;
        }
        return temp == x ? true : false;
    }

}
