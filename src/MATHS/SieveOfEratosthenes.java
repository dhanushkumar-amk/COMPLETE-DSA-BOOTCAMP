package MATHS;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
    int n = 21;
    isPrime(n);
    }

    static  void isPrime(int n){
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <=n ; i++) {
            if (arr[i] == false){
                for (int j = i * 2; j <= n ; j+= i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i < arr.length-1; i++) {
            if (arr[i] == false)
                System.out.println(i);
        }
    }
}
