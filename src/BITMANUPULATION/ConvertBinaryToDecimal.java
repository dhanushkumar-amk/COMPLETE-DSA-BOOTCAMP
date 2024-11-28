package BITMANUPULATION;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        String n = "101101";
        System.out.println(btod(n));
    }
    static  int btod(String n){
        int result = 0;
        int powerOfTwo = 1;  // value of 2 to the power 0 is 1
        for (int i = n.length()-1; i >= 0; i--){
            if (n.charAt(i) == '1') {
                result += powerOfTwo;
            }
            powerOfTwo *= 2;
        }

        return result;
    }

}
