package LINKEDLIST;

public class happyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(happyNumber(n));
    }

    static boolean happyNumber(int n){

        // starts from number itself
        int slow = n;
        int fast = n;

        do{
            slow  = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (fast != slow);

        if (slow == 1)
            return true;
        else
            return false;
    }

  private static int findSquare(int number){
        int answer = 0;
        while (number > 0){
            int remainder = number % 10;
             answer += remainder * remainder;
            number = number / 10;
        }
        return answer;
    }
}
