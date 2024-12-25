package RECURSION;

public class CountNoOfZerosOfAnNumber {
    public static void main(String[] args) {

        int n = 10000000;

        int count = 0;
        while(n != 0){
            int rem = n % 10;

            if (n % 10 == n)
                count++;

            if (rem == 0) {
                count++;
                n = n / 10;
            }else {
                n = n/10;
            }
        }
        System.out.println(count);

    }

}
