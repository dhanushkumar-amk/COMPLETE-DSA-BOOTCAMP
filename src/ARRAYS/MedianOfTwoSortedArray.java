package ARRAYS;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
      int[] arr1 ={1,3,8,17};
      int[] arr2 = {5,6,7,19,21,25};

        System.out.println(findMedian1(arr1, arr2));
    }

    public static float findMedian1(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int k = 0;

        int[] arr3 =  new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        // check remaining elements still inside the boundry

        // arr1
        while (i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }


        // arr2
        while (j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }


        // find median
        if (arr3.length % 2 == 0){
            int mid = arr3.length/2;
           return (float) (arr3[mid] + arr3[mid -1])/2;
        }
        else{
            int mid = arr3.length / 2;
            return arr3[mid];
        }
    }
}
