package MATHS;

public class Fiboacci {
    public static void main(String[] args) {
        int n = 5;

        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i <=n; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.println(n3);
        }
    }
}
