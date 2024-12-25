package RECURSION;

public class CountTheNoOfStepsToReduceTheZero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberSteps(num));
        normal(num);
    }


    static int numberSteps(int num){
            return helper(num, 0);
    }

    static int helper(int num, int steps){

        // base case
        if (num == 0)
            return steps;

        if (num % 2 == 0)
            return helper(num / 2, steps + 1);
        else
            return helper(num - 1, steps + 1);
    }

    static void normal(int num){

        int steps = 0;
        while (num != 0){

            if (num % 2 == 0){
                num = num / 2;
                steps++;
            }
            else{
                num = num - 1;
                steps++;
            }

        }
        System.out.println(steps);

    }
}
