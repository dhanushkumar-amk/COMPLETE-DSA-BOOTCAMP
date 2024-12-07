package SEARCHING;

class BitonicArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 3, 2, 1};
        int target = 8;

        int bitonicIndex = findBitonicPoint(arr);
        int result = searchBitonic(arr, target, bitonicIndex);

        System.out.println("Target found at index: " + result);
    }

    static int ascendingBinarySearch(int[] arr, int target, int range) {
        int low = 0;
        int high = range;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;

            if (target < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    static int descendingBinarySearch(int[] arr, int target, int range) {
        int low = range;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;

            if (target < arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    static int findBitonicPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Ensure bounds safety
            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                    return mid;
                else if (arr[mid] > arr[mid - 1])
                    left = mid + 1;
                else
                    right = mid - 1;
            } else if (mid == 0) {
                // Only one element to the right
                return arr[0] > arr[1] ? 0 : 1;
            } else if (mid == arr.length - 1) {
                // Only one element to the left
                return arr[arr.length - 1] > arr[arr.length - 2] ? arr.length - 1 : arr.length - 2;
            }
        }
        return -1;
    }

    static int searchBitonic(int[] arr, int target, int bitonicIndex) {
        if (arr[bitonicIndex] == target)
            return bitonicIndex;

        if (target > arr[bitonicIndex])
            return -1;

        // Search in ascending part
        int result1 = ascendingBinarySearch(arr, target, bitonicIndex - 1);
        if (result1 != -1) return result1;

        // Search in descending part
        int result2 = descendingBinarySearch(arr, target, bitonicIndex + 1);
        return result2;
    }
}
