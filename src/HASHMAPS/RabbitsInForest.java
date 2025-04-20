package HASHMAPS;

// https://leetcode.com/problems/rabbits-in-forest/description/?envType=daily-question&envId=2025-04-20
// leetcode 781

public class RabbitsInForest {
    public static void main(String[] args) {
     int[] answers = {10,10,10};
     RabbitsInForest answer = new RabbitsInForest();
        System.out.println(answer.numRabbits(answers));
    }

    public int numRabbits(int[] answers) {

        // create the hash and find the frequency
        int[] hash = new int[1001];
        for(int answer: answers)
            hash[answer]++;

        int ans = 0;
        for (int i = 0; i < 1001; i++) {
            if (hash[i] == 0)
                continue;
            else
                ans += Math.ceil( (double) hash[i]/ (i + 1)) * (i + 1);
        }

        return ans;
    }

}
