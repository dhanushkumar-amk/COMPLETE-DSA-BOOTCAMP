package MATHS;

public class CountTotalNumberOfColoredCells {


    public long coloredCells(int n) {

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

}
