package RECURSION;

public class RopeCuttingProblem {
    public static void main(String[] args) {
        int n = 15;
        int a = 8;
        int b = 7;
        int c = 5;

        System.out.println(cutting(n,a,b,c));
    }

    static int cutting(int n, int a, int b, int c){
        if (n == 0)
            return 0;
        else if(n < 0)
            return -1;

        int temp1 = cutting(n - a, a, b, c);
        int temp2 = cutting(n - b, a, b, c);
        int temp3 = cutting(n - c, a, b, c);

        int piece = Math.max(temp1, Math.max(temp2, temp3));

        if (piece == -1)
            return -1;
        else
            return  piece+1;
    }
}
