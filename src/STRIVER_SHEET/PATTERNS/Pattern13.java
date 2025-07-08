package STRIVER_SHEET.PATTERNS;

public class Pattern13 {
    public static void main(String[] args) {
        nNumberTriangle(5);
    }

    public static void nNumberTriangle(int n) {
        int current=1;
        byte [] arr ={1,2,5,5};
        for(byte  i=1;i<=n;++i)
        {
            for(byte j=1;j<=i;++j)
            {
                System.out.print(current + " ");
                System.out.print(i==1 ? arr[i]:"");
                ++current;
            }
            System.out.println();
        }

    }
}
