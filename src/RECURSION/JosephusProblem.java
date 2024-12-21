package RECURSION;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;

        System.out.println(joes(n,k));
    }
    static int joes(int n, int k){
    if (n == 1)
        return 0;   // o is an index of a current D position

        return (joes(n -1, k) + k) % n;
    }
}
