package MATHS;

public class CountTotalNumberOfColoredCells {


    public long coloredCells1(int n) {

        long answer = 1;
        long value = 4;

        if (n == 1)
            return 1;

        for (int i = 2; i <= n ; i++) {
            answer += value;
            value = 4L * i;
        }

        return answer;
    }

    // anotherway
    public long coloredCells(int n) {
        return 1+(long)2*n*(n-1);
    }

}
