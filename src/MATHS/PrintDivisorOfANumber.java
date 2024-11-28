package MATHS;

public class PrintDivisorOfANumber {
    public static void main(String[] args) {
        int n = 25;
        divisor4(n);
    }

    // brute force method1
    public static  void divisor1(int n){
        for (int i = 1; i <=n ; i++) {
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }


    // method 2
    public static  void divisor2(int n){
        for (int i = 1; i* i <= n ; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
                System.out.println(n/ i);
            }
        }
    }

    // method 3
    // efficient  solution
    public static  void divisor3(int n){
        for (int i = 1; i* i <= n ; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
                // remove the duplicates of an numbers
                if ( i != n/i)
                    System.out.println(n/ i);
            }
        }
    }

    // print the divisor in ascending order
    public static  void divisor4(int n){
        int i = 0;
        for ( i = 1; i * i <= n ; i++) {
            if (n % i == 0){
                System.out.println(i);
            }
        }

        // we can use empty to an initialization path in for loop
        // because we initialize the i in above so if i exit that same value exits here it helps us to reverse the for lpop
        for ( ;i >=1;i--){
            if (n % i == 0)
                if ( i != n/i)
                    System.out.println(n/ i);
        }
        }
    }

}
