package SEARCHING;

public class MinimumNumberOfDaysToMakeMBouqutes {
    public static void main(String[] args) {
        int[] days ={1,10,3,9,10,2};
        int boqToMake = 3;
        int flowerToMakeOneBoq = 2;
        System.out.println(minimumDaysToMake(days, boqToMake, flowerToMakeOneBoq));
    }
    static boolean isPossible(int[] days, int boqToMake, int flowerToMakeOneBoq, int mid){

        int adjacentFlowers = 0;
        int boqCount = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] <= mid){
                adjacentFlowers++;

                if (adjacentFlowers == flowerToMakeOneBoq) {
                    boqCount++;

                    if (boqCount == boqToMake) {
                        return true;
                    }
                    // reset the adjacent flowers
                    adjacentFlowers= 0;
                }
            }
            else
                adjacentFlowers = 0;
        }

        return false;
    }

    static int minimumDaysToMake(int[] days, int boqToMake, int flowerToMakeOneBoq){

        // base case
        if(boqToMake * flowerToMakeOneBoq > days.length)
            return -1;

        int low = 0;
        int high = 0;

        // maximum and minimum value in an array
        for (int i = 0; i <days.length ; i++) {
            if (days[i] < low)
                low = days[i];

            if (days[i] > high)
                high = days[i];
        }

        int result = -1;
        while (low <= high){
            int mid = (low + high)/2;

            if (isPossible(days, boqToMake, flowerToMakeOneBoq, mid)){
                result = mid;
                high = mid -1;
            }
            else
                low = mid + 1;
        }

        return result;
    }
}
