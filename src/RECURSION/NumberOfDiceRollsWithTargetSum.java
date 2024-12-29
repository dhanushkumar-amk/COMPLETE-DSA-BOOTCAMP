package RECURSION;

public class NumberOfDiceRollsWithTargetSum {
    public static void main(String[] args) {
       // dice("", 4);
        diceCustomFace("", 4, 9);
    }

    static void dice(String answer, int target){

        if (target == 0){
            System.out.println(answer);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            dice(answer + i, target - i);
        }

    }




    // multiple face dice based problem
    static void diceCustomFace(String answer, int target, int face){

        if (target == 0){
            System.out.println(answer);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            diceCustomFace(answer + i, target - i, face);
        }

    }
}
