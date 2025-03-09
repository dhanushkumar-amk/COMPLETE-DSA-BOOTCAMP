package ARRAYS;


// leetcode 3206
// https://leetcode.com/problems/alternating-groups-i/description/


public class AlternatingGroupsI {

    public int numberOfAlternatingGroups(int[] colors) {

        int n = colors.length;
        int answer = 0;

        for (int i = 0; i < n; i++) {

            if (colors[(i + 1) % n] != colors[i] && colors[i] != colors[(i - 1 + n) % n])
                answer++;
        }
        return answer;
    }

}
