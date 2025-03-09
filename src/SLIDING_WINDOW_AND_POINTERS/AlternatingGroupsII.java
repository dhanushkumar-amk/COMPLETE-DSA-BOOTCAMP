package SLIDING_WINDOW_AND_POINTERS;

// leetcode3208
// https://leetcode.com/problems/alternating-groups-ii/description/?envType=daily-question&envId=2025-03-09

public class AlternatingGroupsII {

    public int numberOfAlternatingGroups(int[] colors, int k) {

        int windowSize = 1;
        int answer = 0;
        int n = colors.length;

        for (int i = 1; i <= n - 1 + k - 1; i++) {
            if (colors[i] != colors[(i - 1 + n) % n])
                windowSize++;
            else
                windowSize = 1;

            if (windowSize >= k)
                answer++;
        }
        return answer;
    }

}
