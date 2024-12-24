package RECURSION;

public class PowerOfNumbers {
    public static void main(String[] args) {
        System.out.println(pow(5,3));
    }


    // not efficient
    static long power(int x, int y){


        if (y == 0)
            return 1;

        return power( x, y-1) * x;

    }

    // efficient solution
    static long pow(int x, int y){

        if (y == 0)
            return 1;

        if (y % 2 == 0)
            return power(x, y-1) * power(x, y-1);
        else
            return power( x, y-1) * x;


    }
}
