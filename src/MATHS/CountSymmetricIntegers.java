package MATHS;

// leetcode 2843
//https://leetcode.com/problems/count-symmetric-integers/description/?envType=daily-question&envId=2025-04-11

public class CountSymmetricIntegers {

    public static void main(String[] args) {

        CountSymmetricIntegers answer = new CountSymmetricIntegers();
        System.out.println(answer.countSymmetricIntegers(1, 100));
    }


    public int countSymmetricIntegers(int low, int high) {

        int answer = 0;

        for (int index = low; index <= high; index++) {

            int num = index;

            if (num > 10 && num <= 99) {

                if (num % 11 == 0)
                    answer++;

            } else if(num > 1000 && num <= 9999){

                int firstPortion = num % 10; // first right most digit
                num /= 10;
                firstPortion += num % 10 ; // second right most digit
                num /= 10;

                int secondPotion = num % 10; // second  first right most digit
                num /= 10;
                secondPotion += num % 10; //  second second right most digit
                num /= 10;

                if (firstPortion == secondPotion)
                    answer++;
            }
        }
        return answer;
    }

}
