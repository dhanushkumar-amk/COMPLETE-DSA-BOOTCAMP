package HASHMAPS;

public class NumberOfEquivalentDominoPairs {
    public static void main(String[] args) {

        NumberOfEquivalentDominoPairs answer = new NumberOfEquivalentDominoPairs();
        int[][] dominoes = {
                {1, 2},
                {2, 1},
                {3, 4},
                {5, 6}
        };

        System.out.println(answer.numEquivDominoPairs(dominoes));

    }
    public int numEquivDominoPairs(int[][] dominoes) {
        int n = dominoes.length;
        int result = 0;
        int[] sum = new int[100];
        for (int i = 0; i < n; i++) {
            int value;
            if (dominoes[i][0] < dominoes[i][1])
                value = 10 * dominoes[i][0] + dominoes[i][1];
            else
                value = 10 * dominoes[i][1] + dominoes[i][0];

            result += sum[value];
            sum[value]++;
        }
        return result;
    }
}