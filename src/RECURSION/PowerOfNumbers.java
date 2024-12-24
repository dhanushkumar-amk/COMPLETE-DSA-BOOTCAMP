package RECURSION;

public class PowerOfNumbers {
    public static void main(String[] args) {
        System.out.println(power(5,8));
    }

    static long power(int x, int y){


        if (y == 0)
            return 1;

        return power( x, y-1) * x;

    }
}
