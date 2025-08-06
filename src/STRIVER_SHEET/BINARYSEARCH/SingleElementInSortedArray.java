package STRIVER_SHEET.BINARYSEARCH;

public class SingleElementInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(single(arr));

    }

    public static int single(int[] arr) {

        int n = arr.length;

        // Base cases for arrays of size 1 or 2
        if (n == 1)
            return arr[0];

        if (arr[0] != arr[1])
            return arr[0];

        if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];

        // Binary search approach for arrays with more than two elements
        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if arr[mid] is the single element
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1])
                return arr[mid];

            // Adjust low and high based on the comparison with neighboring elements
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1]))
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; // If no single element is found (though it shouldn't happen with correct input)
    }
}
