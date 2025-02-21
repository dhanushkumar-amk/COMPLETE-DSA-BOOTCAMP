package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;

public class ZeroOneKnapSack {

    public static void main(String[] args) {
        int[] weight = {3,2,5};
        int[] value = {30, 40, 50};
        int maxWeight = 8;
        int n = value.length;

        System.out.println(knapSack(weight, value, n, maxWeight ));
    }

    static  int knapSack(int[] weight, int[] value, int n, int maxWeight){
        return function(n -1 , maxWeight, weight, value);
    }

    static int function(int index, int bagWeight, int[] weight, int[] value){

        if (index == 0){
            if (weight[0] <= bagWeight)
                return value[0];
            else
                return 0;
        }

        int notSteal = 0 + function(index -1, bagWeight, weight, value);

        int steal = Integer.MIN_VALUE;
        if (weight[index] <= bagWeight)
            steal = value[index] + function(index - 1, bagWeight - weight[index], weight, value);

        return Math.max(steal, notSteal);
    }

}
