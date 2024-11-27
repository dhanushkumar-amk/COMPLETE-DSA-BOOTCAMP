package MATHS;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
    int n = 21;
//    isPrime1(n);
//    isPrime2(n);
    isPrime3(n);
    }

    // method 1
    static  void isPrime1(int n){
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


    // method 2
    static  void isPrime2(int n){
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <=n ; i++) {
            if (arr[i] == false){
//                 just i * i instant i * 2
                for (int j = i * i; j <= n ; j+= i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i < arr.length-1; i++) {
            if (arr[i] == false)
                System.out.println(i);
        }
    }


    // method 3
    static  void isPrime3(int n){
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (arr[i] == false){
                for (int j = i * i; j <= n ; j+= i) {
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
