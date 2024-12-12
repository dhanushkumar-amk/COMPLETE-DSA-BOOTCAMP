package SEARCHING;

public class PainterPartitionProblem {
    public static void main(String[] args) {
        int[] boards  = {10,20,30,40};
        int noOfPainters = 2;
        int timeUnit = 2;
        System.out.println(maximumPossibleAllocationOfBoard(boards, noOfPainters, timeUnit));
    }

    static  boolean isPossible(int[] boards, int mid, int noOfPainters){

        int currentPainters = 1;
        int painterBoardCount = 0;

        for (int i = 0; i <boards.length ; i++) {

            // base condition
            if (boards[i] > mid)
                return false;

            if(painterBoardCount + boards[i] <= mid)
                painterBoardCount += boards[i];

            else {
                currentPainters++;

                if (currentPainters > noOfPainters)
                    return false;

                painterBoardCount += boards[i];
            }
        }
        return true;
    }

    static  int maximumPossibleAllocationOfBoard(int[] boards, int noOfPainters,int timeUnit){
        int low = 0;
        int high = 0;

        for (int i = 0; i < boards.length; i++) {
            high += boards[i];
        }

        int result = 0;
        while (low <= high){
            int mid = (low + high)/2;

            if (isPossible(boards, mid, noOfPainters)){
                result = mid;
               high = mid -1;
            }
            else{
                low = mid + 1;
            }

        }


    }

}
