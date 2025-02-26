package GREEDY;

// leetcode : 3457
// https://leetcode.com/problems/eat-pizzas/

import java.util.Arrays;

public class EatPizzas {



    public long maxWeight(int[] pizzas) {

        // sort the array
        Arrays.sort(pizzas);

        int size = pizzas.length;
        int totalDays = size / 4;
        int currentIndex = size - 1;  // starts form last index
        long maxTotalWeight = 0;

        // odd days  from las to front by 2
        for (int day = 1; day <= totalDays; day += 2) {
            maxTotalWeight += pizzas[currentIndex];
            currentIndex--;
        }

        currentIndex--;
        for (int day = 2; day < totalDays; day += 2) {
            maxTotalWeight += pizzas[currentIndex];
            currentIndex -= 2;
        }

        return maxTotalWeight;


    }
}
