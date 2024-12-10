package SEARCHING;

public class BookAllocationProblem {
    public static void main(String[] args) {
        int[] pages = {12,34,67,90};
        int student = 2;
        System.out.println(maxValue(pages, student));
    }

    static boolean isPossibleSolution(int[] pages, int student, int mid){

        int currentStudent = 1;
        int pageCount = 0;

        for (int i = 0; i < pages.length ; i++) {

            if (pages[i] > mid)
                return false;


            if (pageCount + pages[i] <= mid)
                pageCount += pages[i];
            else{
                currentStudent++;

                if (currentStudent > student)
                    return false;

                currentStudent = pages[i];
            }

        }

        return true;
    }

    static int maxValue(int[] pages, int student){
        if (student > pages.length)
            return -1;

        int low = pages[0];
        int high = 0;

        for (int i = 0; i < pages.length; i++) {
            if (pages[i] < low )
                low = pages[i];

            high += pages[i];  // is a sum of all pages
        }

        int result  = -1;
        while (low <= high){
            int mid = (low + high)/2;

            if(isPossibleSolution(pages, student, mid)){
                result = mid;
                high = mid -1;
            }
            else
                low = mid + 1;
        }
        return result;
    }


}
